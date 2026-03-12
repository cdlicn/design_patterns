package com.cdlicn.pattern.memento.black_box;

/**
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {

    // 声明Memento类型的变量
    private Memento Memento;

    public Memento getMemento() {
        return Memento;
    }

    public void setMemento(Memento memento) {
        Memento = memento;
    }
}
