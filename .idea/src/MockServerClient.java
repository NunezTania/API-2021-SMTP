public class MockServerClient implements Runnable { // Single threaded server, need to tranform this class into a worked


    private Socket clientSocket = null;
    private BufferedReader in = null;
    private PrintWriter out = null;

    public MockServerClient() { // TODO : see how to get this hardcoded Socket off the code

        clientSocket = new Socket("127.0.0.1", 80);
        in = new BufferedReader(clientSocket.getInputStream());
        out = new PrinterWriter(clientSocket.getOutputSteam());

    }

    public run() {


        String request = "EHLO google.com"; // TODO : see how to get this hardcoded request off the code


        String responseLine;
        while(in.ready()) {
            responseLine = in.readLine();
            if (Integer.parseInt(responseLine.substring(0, 3)) != 250) {
                // Erreur
            } else {

                // Process response and send the jokes

            }
            // Print the line if needed
        }

    }

}