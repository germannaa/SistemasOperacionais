'''import socket 
host = 'localhost' 
port = 7000 
addr = (host, port) 
serv_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serv_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1) 
serv_socket.bind(addr) 
serv_socket.listen(10) 
print ('aguardando conexao') 
con, cliente = serv_socket.accept() 
print ('conectado' )
print ("aguardando mensagem") 
recebe = con.recv(1024) 
print ('mensagem recebida:'+ recebe )
serv_socket.close()
'''


import socket
 
HOST = '127.0.0.1'     # Endereco IP do Servidor
PORT = 2345      # Porta que o Servidor está
 
# Criando a conexão
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
destino = (HOST, PORT)
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

