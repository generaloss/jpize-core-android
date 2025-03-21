package jpize.android.opengl;

import android.opengl.GLES32;
import jpize.opengl.gl.GLI42;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class AndroidGL42 extends AndroidGL41 implements GLI42 {

    @Override
    public void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, IntBuffer params) {
        GLES32.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    @Override
    public int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
        return GLES32.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
    }

    @Override
    public void glTexStorage1D(int target, int levels, int internalformat, int width) {
        GLES32.glTexStorage1D(target, levels, internalformat, width);
    }

    @Override
    public void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
        GLES32.glTexStorage2D(target, levels, internalformat, width, height);
    }

    @Override
    public void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        GLES32.glTexStorage3D(target, levels, internalformat, width, height, depth);
    }

    @Override
    public void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
        GLES32.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    @Override
    public void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
        GLES32.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

    @Override
    public void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
        GLES32.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    @Override
    public void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseInstance(int mode, ByteBuffer indices, int primcount, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseInstance(int mode, ShortBuffer indices, int primcount, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseInstance(int mode, IntBuffer indices, int primcount, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    @Override
    public void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override
    public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, IntBuffer indices, int primcount, int basevertex, int baseinstance) {
        GLES32.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    @Override
    public void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        GLES32.glBindImageTexture(unit, texture, level, layered, layer, access, format);
    }

    @Override
    public void glMemoryBarrier(int barriers) {
        GLES32.glMemoryBarrier(barriers);
    }

    @Override
    public void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
        GLES32.glGetInternalformativ(target, internalformat, pname, params);
    }

    @Override
    public int glGetInternalformati(int target, int internalformat, int pname) {
        return GLES32.glGetInternalformati(target, internalformat, pname);
    }

    @Override
    public void glGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, int[] params) {
        GLES32.glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
    }

    @Override
    public void glGetInternalformativ(int target, int internalformat, int pname, int[] params) {
        GLES32.glGetInternalformativ(target, internalformat, pname, params);
    }

}