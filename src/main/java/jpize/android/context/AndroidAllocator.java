package jpize.android.context;

import jpize.context.input.IAllocator;

import java.nio.ByteBuffer;

public class AndroidAllocator implements IAllocator {

    @Override
    public ByteBuffer memCalloc(int capacity) {
        return ByteBuffer.allocateDirect(capacity);
    }

    @Override
    public void memFree(ByteBuffer buffer) { }

}
