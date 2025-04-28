package src.study.design.pattern.adapter.impl;

import src.study.design.pattern.adapter.SquareSocket;
import src.study.design.pattern.model.RoundSocket;

public class SocketAdapterImpl implements SquareSocket {

    private RoundSocket roundSocket;

    public SocketAdapterImpl(RoundSocket roundSocket) {
        this.roundSocket = roundSocket;
    }

    @Override
    public void squarePlugIn() {
        roundSocket.roundPlugIn();
    }
}
