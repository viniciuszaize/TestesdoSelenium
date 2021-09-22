# language: pt

  @teste
  Funcionalidade: Preencher formularios e receber a mensagem de sucesso

    Cenario: Preencho os formularios com as informaçoes necessarias

      Dado o formulário aba “Enter Vehicle Data” e pressione next
      Dado Preencher o formulário aba “Enter Insurant Data” e pressione next
      Dado Preencher o formulário aba “Enter Product Data” e pressione next
      Dado Preencher o formulário aba “Select Price Option” e pressione next
      Quando Preencher o formulário aba “Send Quote” e pressione Send
      Entao Verificar a mensagem “Sending e-mail success!” na tela

