package midtermgitcode2.ice3;

import java.util.ArrayList;

class LittleGirl {
    private Client[] clients;
    private int current = 0;

    public LittleGirl(Client[] clients) {
        this.clients = clients;
    }

    public void breadReady() {
        if (clients.length == 0) return;

        System.out.println("*** delivered bread to " + clients[current].getName());
        clients[current].breadReady();

        current++;
        if (current >= clients.length) {
            current = 0;
        }
    }
}
