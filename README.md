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

---

## Esercizio 5: Server di Messaggistica
#### **Obiettivo**
Realizzare un'applicazione di messaggistica istantanea basata su un'architettura client-server. Il sistema dovrà permettere a più client di connettersi a un server centrale per scambiarsi messaggi in tempo reale.

#### **Requisiti Funzionali**
1.  **Identificazione Univoca**: Ogni client deve essere identificato da un nome utente univoco, comunicato al server subito dopo la connessione.
2.  **Connessione Persistente**: La connessione TCP tra client e server deve rimanere attiva fino a quando il client non decide di disconnettersi.
3.  **Invio Messaggi**: Un client può inviare un messaggio a un altro client specificando l'identificativo del destinatario e il testo del messaggio.
4.  **Routing**: Il server è responsabile di ricevere i messaggi e inoltrarli al client destinatario corretto.

#### **Requisiti Tecnici e Architetturali**
1.  **Gestione Concorrenza (Server)**: Il server deve gestire ogni client connesso in un **thread dedicato**.
2.  **Gestione Concorrenza (Client)**: Ogni client deve utilizzare **due thread**:
    * Un thread per gestire l'input dell'utente da tastiera e l'invio dei messaggi al server.
    * Un thread per rimanere in ascolto e ricevere i messaggi in arrivo dal server.
3.  **Validazione (Server)**: Il server deve implementare i seguenti controlli:
    * Rifiutare connessioni da client che utilizzano un identificativo già esistente.
    * Notificare al mittente se il destinatario di un messaggio non esiste o non è connesso.

#### **Protocollo di Comunicazione**
La scelta del protocollo è libera. Per semplicità, si può iniziare con un formato testuale basato su stringhe (es. una per il destinatario e una per il testo).

**Bonus**
Invece di usare semplici stringhe, implementare la comunicazione attraverso lo scambio di **oggetti serializzati**. Questo permette di incapsulare in un unico oggetto tutte le informazioni necessarie (mittente, destinatario, testo, tipo di messaggio, timestamp, ecc.), creando un protocollo più strutturato e facilmente estensibile.