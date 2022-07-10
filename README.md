# Trabalho de Implementação com Middleware

Aplicação: A ideia de aplicação, é a necessidade de alguma empresa solicitar um programa para criptografar suas mensagens devido ao medo de que seus adversários possam estar visualizando as mensagens que estão enviando pelos seus superiores. 

Desenvolvimento do programa usando o Java RMI-> O que é RMI - > É uma interface de programação que permite a invocação de métodos remotos. O RMI fornece um framework para o desenvolvimento de Sistemas distribuídos, mas como ele permite isso, o objeto pode chamar um método de outro objeto em outro sistema na rede. 

# O algoritmo: 

1- Criação da interface com os métodos no servidor;
2- Uma classe localizada no JVM (Java Virtual Machine) que vai implementar os métodos definidos na interface;
3- Classe que implementa o protocolo de comunicação, protocolo utilizado foi o Stub ele é responsável por fazer a chamada de método no cliente seja passada ao servidor, assim como fazer o servidor responder a essa chamada, trazendo de volta a resposta solicitada pelo cliente. 
4- Um serviço de nomes (rmiregistry) responsável em informar o cliente onde está o servidor. 
5 – Execultar o servidor e depois o cliente e ver o sistema funcionando. 

# Programação: 
Foi definida uma interface, a interface de Criptografia, a classe que implementa essa interface, a classe CriptografiaImpl, a classe ClienteCriptografia e a classe ServidorCriptografia.
As classes Skel e Stub não precisam ser programadas manualmente, pois são geradas automaticamente por uma ferramenta própria do SDK (rmic). A partir da versão 1.2 de SDK, a classe Skel não é mais necessária, pois java já a implementa.
