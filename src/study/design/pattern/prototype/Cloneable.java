package src.study.design.pattern.prototype;

import src.study.design.pattern.prototype.impl.Picture;

public interface Cloneable {
    Picture clone() throws CloneNotSupportedException;
}
