# Microsservice InDespensa - Recomendação de Produtos
O microserviço InDespensa - Recomendação de Produtos é responsável por consultar um banco de dados MongoDB que armazena informações geradas por uma IA criada pelo pessoal de DS, com recomendações de produtos para usuários do aplicativo InDespensa. Essas recomendações são baseadas em análises feitas por um sistema de inteligência artificial.

## 🚀 Funcionalidades 
- **Consulta de Recomendações**: Consulta o MongoDB para recuperar recomendações de produtos personalizadas para cada usuário, baseadas em seus hábitos de consumo e preferências.
- **Integração com IA**: A IA responsável pelas recomendações é gerida externamente. O microsserviço se conecta ao banco de dados para obter essas informações e repassá-las ao aplicativo InDespensa.
- **Armazenamento no MongoDB**: Todas as informações de recomendação são armazenadas no MongoDB, possibilitando consultas rápidas e eficientes.
- **Logs e Monitoramento**: Gera logs detalhados das operações realizadas e oferece suporte a ferramentas de monitoramento para acompanhar o desempenho e a saúde do microserviço.

## ☕ Tecnologias Utilizadas
- **Linguagem de Programação**: Java
- **Framework**: Spring
- **Banco de Dados**: MongoDB
- **Serviço de Hospedagem**: A definir

## 🤝 Colaboradores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/pedroggwp" title="Perfil do Pedro H. Nascimento">
        <img src="https://github.com/pedroggwp.png" width="100px;" alt="Foto do Pedro Henrique no GitHub"/><br>
        <sub>
          <b>Pedro H. Nascimento</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Davipiassi" title="Perfil do Davi Piassi">
        <img src="https://github.com/Davipiassi.png" width="100px;" alt="Foto do Davi Piassi no GitHub"/><br>
        <sub>
          <b>Davi Piassi</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 🔡 Padrões de Branch
Para organização, novas branches devem ser criadas seguindo o seguinte padrão: `tipo/numeroDaTarefa/nomeDescritivo`
#### Tipos de Branch
| Tipo   | Decrição            |
| ------ | ------------------- |
| feat   | Nova funcionalidade | 
| debug  | Correção de bug     |
| config | Configuração        |
| doc    | Documentação        |
#### Número da Tarefa
Código da tarefa no quadro do [Trello](https://trello.com/b/5BLwrWfB/indespensa)
#### Nome Descritivo
Nome extremamente breve que represente o que foi feito naquela modificação

## 📝 Licença
Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE) para mais detalhes.

## ✍ Contato
Para dúvidas ou suporte, entre em contato com ottis.indespensa@gmail.com
