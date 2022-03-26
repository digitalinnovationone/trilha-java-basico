# Configurando o ambiente

Para começar a desenvolver em Java é necessário que tenhamos o JDK instalado.

{% hint style="warning" %}
É extremamente relevante determinar a versão do Java que precisa utilizar diante de alguns requisitos do projeto.
{% endhint %}

### Instalando o JDK no Windows

{% hint style="info" %}
Algumas IDEs como o [VSCode](https://code.visualstudio.com/docs/java/java-tutorial) já consegue baixar e instalar o JDK e realizar a configuração de forma fácil.
{% endhint %}

* Busque no Google por Java [JDK xxx](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html) (versão desejada)
* Selecione a opção **.exe** de acordo com o seu sistema operacional. No meu exemplo eu baixei a versão: [jdk-8u202-windows-x64.exe](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html#license-lightbox)

![](<../.gitbook/assets/image (5) (1).png>)

* Depois você precisará realizar um login no site da [Oracle](https://login.oracle.com/mysso/signon.jsp).

![](<../.gitbook/assets/image (9) (1) (1).png>)

* Após realizar o download, executar o instalador para instalar o Java no Windows. Este processo instalará tanto o **JDK** quanto a **JRE**.

![](<../.gitbook/assets/image (12) (1) (1).png>)

{% hint style="warning" %}
Evite mudar o diretório de instalação
{% endhint %}

* Em seu explorer deve ter algo mais ou menos assim:

![](<../.gitbook/assets/image (1).png>)

* Precisamos agora validar se a instalação também já configurou nossa variável de ambiente para poder executar o Java pelo Prompt de comando ou PowerShell do Windows.
* Abre o Prompt de comando e execute o comando `java -version`.

![](../.gitbook/assets/image.png)

{% hint style="info" %}
Não iremos configurar as variáveis de ambiente pois não é um pré-requisito para desenvolver em Java considerando que iremos usufruir das mais poderosas IDEs para aumentar nossa produtividade em codificar na linguagem.
{% endhint %}

{% content-ref url="escolha-sua-ide.md" %}
[escolha-sua-ide.md](escolha-sua-ide.md)
{% endcontent-ref %}
