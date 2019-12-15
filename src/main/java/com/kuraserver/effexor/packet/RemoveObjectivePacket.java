package com.kuraserver.effexor.packet;

import cn.nukkit.network.protocol.DataPacket;

public class RemoveObjectivePacket extends DataPacket {

    public String objectiveName;

    @Override
    public byte pid() {
        return 106;
    }

    @Override
    public void decode() {

    }

    @Override
    public void encode() {
        this.reset();
        this.putString(this.objectiveName);
    }
}
