# Classes

Toda a estrutura de código na linguagem Java é distribuído em arquivos com extensão **.java** denominados de **classe**.

As classes existentes em nosso projeto serão composta por:&#x20;

**Identificador**, **Características** e **Comportamentos**.

* **Classe** _(class)_: A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.
* **Identificador** (identity): Propósito existencial aos objetos que serão criados.&#x20;
* **Características** _(states)_**:** Também conhecido como **atributos** ou **propriedades**, é toda informação que representa o estado do objeto.
* **Comportamentos** _(behavior)_**:** Também conhecido como **ações** ou **métodos**, é toda parte comportamental que um objeto dispõe.
* **Instanciar** _(new)_**:** É o ato de criar um objeto a partir de estrutura definida em uma classe. &#x20;

![Ilustração de uma classe Estudente e 03 objetos criados](<../.gitbook/assets/image (9).png>)



Seguindo algumas convenções, as nossas classes são classificadas como:

* **Classe de modelo**: classes que representem estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.
* **Classe de serviço**: classes que contém regras de negócio e validação de nosso sistema.
* **Classe de repositório**: classes que contém uma integração com banco de dados.
* **Classe de controladora**: classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.
* **Classe utilitária**:  classe que contém recursos comuns à toda nossa aplicação.

![Modelo aplicado em grande parte dos projetos atuais](<../.gitbook/assets/image (7).png>)

{% hint style="success" %}
Exercite a distribuição de classes por papéis dentro da sua aplicação para que se possa determinar a estrutura mais conveniente em cada arquivo do seu projeto.
{% endhint %}
