package com.revision.rest.revisiondemosecurity.Modele;

public class Message {
    private final long id;
    private final String texte;

    public Message(long id, String texte) {
        this.id = id;
        this.texte = texte;
    }

    public long getId() {
        return id;
    }

    public String getTexte() {
        return texte;
    }
}
