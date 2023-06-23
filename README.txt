------------- Backend ----------------------
1 -> Descompactar o arquivo
2 -> Começando pela pasta backend, abre ela em algum editor de codigo de sua preferência: Eclipse, Intelij, NetBeans....
3 -> Após abrir ele no editor, ir até a classe BackendApplication.java e clicar em run, para que o backend suba em um servidor Apache TomCat.
4 -> Depois de fazer os passos acima, pronto o backend já está no ar!!!

Obs: É necessário que esteja com o Java 11 instalado ná sua máquina, para que o backend rode na versão que ele foi desenvolvido.
------------- FrontEnd ----------------------
1 -> Abra a pasta via_facil_web dentro da pasta site em algum editor de código de preferência, sempre usamos o visual studio code quando vamos mexer com Typescript no frontend em si.
2 -> Após ter entrado na pasta pelo editor, abra o terminal dentro da pasta e rode o comando npm install para que baixe a pasta node_modules, essa pasta contém todas as dependencias usadas em nosso projeto.
3 -> Importante ressaltar, que você deve ter o node.js com a versão LTS (Suporte de Longo Prazo) instalada em sua máquina.
4 -> Após isso você deve rodar o comando npm start no terminal e pronto, o frontend vai rodar no servidor local na porta 3000.

Link para baixar o nodejs -> https://nodejs.org/en/

------------- Docker ---------------------------

1 -> Com o docker instalado na máquina, execute um terminal com permissão de administrador
2 -> Va até a pasta raiz do projeto e execute os seguintes comandos:

	--> docker compose build
	--> docker compose up
       