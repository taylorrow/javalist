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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListEngine list = new ListEngine();
        // Добавляем эл-нт в конец списка
        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        // Добавляем эл-нт в начало списка
        list.addFront(7);
        list.addFront(8);
        list.addFront(9);
        // Распечатываем список
        System.out.println("Заполненный список");
        list.printList();
        System.out.println();
        // Переворачиваем список
        System.out.println("Перевернутый  список");
        list.reverseList();
        list.printList();
        System.out.println();
        // Еще раз переворачиваем список, но методом рекурсии
        System.out.println("Перевернутый  список методом рекурсии");
        list.reverseListRec(null, null);
        list.printList();
    }
}
