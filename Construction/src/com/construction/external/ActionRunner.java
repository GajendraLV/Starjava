package com.construction.external;

import com.construction.internal.Action;
import com.construction.internal.Spirit;

public class ActionRunner {
    public static void main(String[] args) {
        Action action = new Action();
        Spirit spirit1 = new Spirit(20, "gaja");
        Spirit spirit2 = new Spirit(30, "master");
        Spirit spirit3 = new Spirit(40, "dragon");
        Spirit[] eye = {spirit1, spirit2, spirit3};
        action.reason(eye);
    }
}
