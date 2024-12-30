# cpu-wizzard

Essa é a parte do backend do projeto CpuWizzard. Foi construido utilziando o framework Spring Boot. O backend trabalha com 3 camadas importantes. Controllers, Model e Services.

## Model
Aqui foi definido o corpo da resposta da API, que os seguintes atributos: Processador, Arquitetura, informações de Cache, Frequencia e justificativa da escolha. 

## Services
Na camada de service é onde está a lógica de escolha da CPU, Recebendo do frontend os criterios para a CPU, o serviço define qual cpu recomendar e devolve a resposta. 

## Controllers
 Nessa camada foi onde ficou definido os endpoints da aplicação que são apenas dois: 

 POST:  /recommend
 GET : /saiba-mais


 ## Requisitos 
    open-jdk-17

 ## Como rodar

   # Clone o repositório
     git clone https://github.com/DerickWiller/cpu-wizzard.git
  # Abra no vscode ou intellij 
     Clique no botão de play pra startar a aplicação

  # para acessar as rotas
      localhost:8080/
