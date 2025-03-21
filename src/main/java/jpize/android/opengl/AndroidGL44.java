package jpize.android.opengl;

import android.opengl.GLES32;
import jpize.opengl.gl.GLI44;

import java.nio.*;

public class AndroidGL44 extends AndroidGL43 implements GLI44 {

    @Override
    public void nglBufferStorage(int target, long size, long data, int flags) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBufferStorage(int target, long size, int flags) {
        GLES32.glBufferStorage(target, size, flags);
    }

    @Override
    public void glBufferStorage(int target, ByteBuffer data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, ShortBuffer data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, IntBuffer data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, FloatBuffer data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, DoubleBuffer data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void nglClearTexImage(int texture, int level, int format, int type, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, ByteBuffer data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, ShortBuffer data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, IntBuffer data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, FloatBuffer data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, DoubleBuffer data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void nglBindBuffersBase(int target, int first, int count, long buffers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindBuffersBase(int target, int first, IntBuffer buffers) {
        GLES32.glBindBuffersBase(target, first, buffers);
    }

    @Override
    public void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglBindTextures(int first, int count, long textures) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindTextures(int first, IntBuffer textures) {
        GLES32.glBindTextures(first, textures);
    }

    @Override
    public void nglBindSamplers(int first, int count, long samplers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindSamplers(int first, IntBuffer samplers) {
        GLES32.glBindSamplers(first, samplers);
    }

    @Override
    public void nglBindImageTextures(int first, int count, long textures) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindImageTextures(int first, IntBuffer textures) {
        GLES32.glBindImageTextures(first, textures);
    }

    @Override
    public void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBufferStorage(int target, short[] data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, int[] data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, float[] data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, double[] data, int flags) {
        GLES32.glBufferStorage(target, data, flags);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] data) {
        GLES32.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, short[] data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, int[] data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, float[] data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, double[] data) {
        GLES32.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glBindBuffersBase(int target, int first, int[] buffers) {
        GLES32.glBindBuffersBase(target, first, buffers);
    }

    @Override
    public void glBindTextures(int first, int[] textures) {
        GLES32.glBindTextures(first, textures);
    }

    @Override
    public void glBindSamplers(int first, int[] samplers) {
        GLES32.glBindSamplers(first, samplers);
    }

    @Override
    public void glBindImageTextures(int first, int[] textures) {
        GLES32.glBindImageTextures(first, textures);
    }

}