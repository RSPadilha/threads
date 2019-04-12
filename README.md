# threads
1) Faça um programa composto por duas threads: a primeira deve exibir em ordem crescente os números de 1 a 500; a segunda deve exibir em ordem decrescente os números entre 500 e 1. As threads devem ser executadas concorrentemente.

2) Faça um programa concorrente que imprima em uma thread os números pares e em outra thread os números ímpares até 100 (adicione um sleep variável - aleatório).

3) Crie uma aplicação concorrente que imprima todos os valores de 1 a 100. O número de Threads é solicitado ao usuário e cada Thread vai ser responsável por uma sequência de números, conforme o resto da divisão de 100 pelo número de Threads.

Exemplo: Numero de Threads: 4

Thread 1: responsável por imprimir 1, 5, 9, 13, 17, ...

Thread 2: responsável por imprimir 2, 6, 10, 14, 18, ...

Thread 3: responsável por imprimir 3, 7, 11, 15, 19, ...

Thread 4: responsável por imprimir 4, 8, 12, 16, 20, ...

4) Faça uma aplicação Java multithread para buscar um dado elemento em um vetor de 200 posições (desordenado). Utilize um objeto Random para gerar números aleatórios.

– Cada Thread ficará responsável pela busca em uma parte do vetor

– Retorne a posição do elemento no vetor ou –1 caso o elemento não foi encontrado

5) Crie uma aplicação que apresenta numa tela 3 relógios digitais, que mostre inclusive os segundos. Cada relógio inicia com 0 e a cada segundo se atualiza.

6) Seguindo a aplicação anterior, adicione a opção do usuário poder configurar alarmes

(definidos por um horário) para cada relógio. Quando chegar no horário do alarme, um

alerta (JOptionPane) é disparado.

7) Crie uma aplicação concorrente para simular um dashboard de sensores. Esse dashboard possui duas threads. A primeira simula a entrada de dados na rede: recebe informações de qual sensor e o novo dado a partir do console (ou JOptionPane). A segunda atualiza o dashboard.

8) Implemente uma corrida entre lebres e tartarugas:

- Cada animal deve ser uma Thread;

- Tartaruga possui o atributo velocidade (centímetros por segundo)

- Lebre possui os atributos: velocidade (centímetros por segundo), quantidade de cochilos por corrida, tempo de cochilo (máximo 20 segundos).

- Os dados dos animais devem ser aleatórios (gerado pela classe Random).

- A corrida tem uma distância de N metros, onde N é solicitado pelo usuário.

- O número de lebres e tartarugas deve ser o mesmo e deve ser solicitado pelo usuário.

