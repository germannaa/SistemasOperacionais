'''import socket 
ip = input('digite o ip de conexao: ') 
port = 7000 
addr = ((ip,port)) 
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
client_socket.connect(addr) 
mensagem = input("digite uma mensagem para enviar ao servidor") 
client_socket.send(mensagem) 
print ('mensagem enviada') 
client_socket.close()'''


 
import socket
 
HOST = '127.0.0.1'      # Endereco IP do Servidor
PORT = 2345             # Porta que o Servidor está
 
# Criando a conexão
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
destino = ((HOST, PORT))
tcp.bind(destino)
tcp.listen(1)

 
print('\nDigite suas mensagens')
print('Para sair use CTRL+X\n')
 
# Recebendo a mensagem do usuário final pelo teclado
mensagem = input()
 
# Enviando a mensagem para o Servidor TCP através da conexão
while mensagem != '\x18':
    tcp.send(str(mensagem).encode())
    mensagem = input()
 
# Fechando o Socket
tcp.close()
