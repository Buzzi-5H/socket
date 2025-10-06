# Esercizi sui Socket in Java

Questa raccolta contiene una serie di esercizi progressivi per apprendere i fondamenti della programmazione di rete in Java utilizzando i socket TCP.

Trovate già le cartelle per ogni esercizio con i file .java da completare.

---

## Esercizio 1: Simple Hello World
Stabilire una connessione di base in cui un client invia un singolo messaggio a un server. Il server riceve il messaggio, lo stampa sulla console e sia il client che il server terminano l'esecuzione.

---

## Esercizio 2: Echo Server (Uso Singolo)
Creare un server che rispedisce al client lo stesso messaggio che ha ricevuto (echo). Dopo questo scambio, entrambe le applicazioni terminano.

---
## Esercizio 2.5: Echo Server Multiplo (Uso Singolo)
Creare un server che rispedisce al client i messaggi che riceve finché il client non invia il messaggio "exit". Dopodiché entrambe le applicazioni terminano.

---
## Esercizio 3: Echo Server Persistente
Modificare il server dell'esercizio precedente in modo che non termini dopo aver gestito un client. Deve invece rimanere attivo e in ascolto, pronto a servire un nuovo client dopo aver concluso con il precedente.
Riusare il client del precedente esercizio.

---

## Esercizio 4: Echo Server Multi-Thread
Rendere il server capace di gestire più client **contemporaneamente**. Ogni nuova connessione viene gestita da un thread separato, permettendo al server di accettare altre connessioni senza dover attendere la fine delle precedenti.
