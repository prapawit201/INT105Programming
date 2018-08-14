/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

public abstract class Key {
    private int keyId;

    public Key(int keyId) {
        this.keyId = keyId;
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toString() {
        return "Key{" + "keyId=" + keyId + '}';
    }
    

}
