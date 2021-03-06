package collections.customlinkedlist;

import java.io.Serializable;

/**
 * POJO representing a Link
 * User: vpaloju
 * Date: 10/29/13
 * Time: 3:34 PM
 */
public class Link implements Cloneable, Serializable {

    private int data;
    private Link next;
    private Object random;

    protected Link(int data) {
        this.data = data;
        this.next = null;
    }

    public Link getNext() {
        return next;
    }

    protected void setNext(Link next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    protected void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getData());
    }

    @Override
    public Link clone() throws CloneNotSupportedException {
        return (Link) super.clone();
    }

    public Object getRandom() {
        return random;
    }

    public void setRandom(Object random) {
        this.random = random;
    }
}
