package jpize.android.opengl;

import android.opengl.GLES31;
import jpize.opengl.gl.GLI46;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class AndroidGL46 extends AndroidGL45 implements GLI46 {

    @Override
    public void glMultiDrawArraysIndirectCount(int mode, ByteBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        GLES31.glDrawArraysIndirect(mode, indirect);
    }

    @Override
    public void glMultiDrawArraysIndirectCount(int mode, IntBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawElementsIndirectCount(int mode, int type, ByteBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        GLES31.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override
    public void glMultiDrawElementsIndirectCount(int mode, int type, IntBuffer indirect, long drawcount, int maxdrawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPolygonOffsetClamp(float factor, float units, float clamp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSpecializeShader(int shader, ByteBuffer pEntryPoint, IntBuffer pConstantIndex, IntBuffer pConstantValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSpecializeShader(int shader, CharSequence pEntryPoint, IntBuffer pConstantIndex, IntBuffer pConstantValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawArraysIndirectCount(int mode, int[] indirect, long drawcount, int maxdrawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawElementsIndirectCount(int mode, int type, int[] indirect, long drawcount, int maxdrawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSpecializeShader(int shader, ByteBuffer pEntryPoint, int[] pConstantIndex, int[] pConstantValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSpecializeShader(int shader, CharSequence pEntryPoint, int[] pConstantIndex, int[] pConstantValue) {
        throw new UnsupportedOperationException();
    }

}