/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Maxim
 */
public class ListEngine {

    private ListItem head;       // указатель на первый элемент
    private ListItem tail;       // указатель последний элемент

    // Добавление эл-та в начало списка
    void addFront(int data) {
        ListItem t = new ListItem();
        t.data = data;
        // Если список пуст
        if (head == null) {
            head = t;
            tail = t;
        } else {
            t.next = head;
            head = t;
        }
    }

    // Добавление эл-та в конец списка
    void addBack(int data) {
        ListItem t = new ListItem();
        t.data = data;
        // Если список пуст
        if (tail == null) {
            head = t;
            tail = t;
        } else {
            tail.next = t;
            tail = t;
        }
    }

    // Реверсия списка
    void reverseList() {
        ListItem t1 = head.next;
        ListItem t2 = head;
        ListItem t3 = tail.next;
        while (t1 != t3) {
            addFront(t1.data);
            t1 = t1.next;
        }
        tail = t2;
        tail.next = null;
    }

    // Реализация реверсии с помошью рекурсии
    void reverseListRec(ListItem t1, ListItem t2) {
        // Если в списке один эл-нт, то выйти
        if (head.next == null) {
            return;
        }

        // При первом заходе
        if (t1 == null) {
            t1 = head.next;
            tail.next = tail;
            t2 = head;
        }

        // Обработка последнего эл-та списка
        if (t1 == tail.next) {
            addFront(t1.data);
            tail = t2;
            tail.next = null;
            return;
        }
        // Сортировка и переход на следующий эл-нт
        addFront(t1.data);
        t1 = t1.next;
        reverseListRec(t1, t2);
    }

    //Печать списка
    void printList() {
        ListItem t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}
