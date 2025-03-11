package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI15;
import java.nio.*;

public class AndroidGL15 extends AndroidGL14 implements GLI15 {

    @Override
    public void glBindBuffer(int target, int buffer) {
        GLES11.glBindBuffer(target, buffer);
    }

    @Override
    public void nglDeleteBuffers(int n, long buffers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteBuffers(IntBuffer buffers) {
        GLES11.glDeleteBuffers(buffers.limit(), buffers);
    }

    @Override
    public void glDeleteBuffers(int buffer) {
        tmp_int[0] = buffer;
        GLES11.glDeleteBuffers(1, tmp_int, 0);
    }

    @Override
    public void nglGenBuffers(int n, long buffers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenBuffers(IntBuffer buffers) {
        GLES11.glGenBuffers(buffers.limit(), buffers);
    }

    @Override
    public int glGenBuffers() {
        GLES11.glGenBuffers(1, tmp_int, 0);
        return tmp_int[0];
    }

    @Override
    public boolean glIsBuffer(int buffer) {
        return GLES11.glIsBuffer(buffer);
    }

    @Override
    public void nglBufferData(int target, long size, long data, int usage) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBufferData(int target, long size, int usage) {
        throw new UnsupportedOperationException(); // args
    }

    @Override
    public void glBufferData(int target, ByteBuffer data, int usage) {
        GLES11.glBufferData(target, data.limit(), data, usage); // int target, int size, Buffer data, int usage
    }

    @Override
    public void glBufferData(int target, ShortBuffer data, int usage) {
        GLES11.glBufferData(target, data.limit(), data, usage);
    }

    @Override
    public void glBufferData(int target, IntBuffer data, int usage) {
        GLES11.glBufferData(target, data.limit(), data, usage);
    }

    @Override
    public void glBufferData(int target, LongBuffer data, int usage) {
        GLES11.glBufferData(target, data.limit(), data, usage);
    }

    @Override
    public void glBufferData(int target, FloatBuffer data, int usage) {
        GLES11.glBufferData(target, data.limit(), data, usage);
    }

    @Override
    public void glBufferData(int target, DoubleBuffer data, int usage) {
        GLES11.glBufferData(target, data.limit(), data, usage);
    }

    @Override
    public void nglBufferSubData(int target, long offset, long size, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBufferSubData(int target, long offset, ByteBuffer data) {
        GLES11.glBufferSubData(target, (int) offset, data.limit(), data);
    }

    @Override
    public void glBufferSubData(int target, long offset, ShortBuffer data) {
        GLES11.glBufferSubData(target, (int) offset, data.limit(), data);
    }

    @Override
    public void glBufferSubData(int target, long offset, IntBuffer data) {
        GLES11.glBufferSubData(target, (int) offset, data.limit(), data);
    }

    @Override
    public void glBufferSubData(int target, long offset, LongBuffer data) {
        GLES11.glBufferSubData(target, (int) offset, data.limit(), data);
    }

    @Override
    public void glBufferSubData(int target, long offset, FloatBuffer data) {
        GLES11.glBufferSubData(target, (int) offset, data.limit(), data);
    }

    @Override
    public void glBufferSubData(int target, long offset, DoubleBuffer data) {
        GLES11.glBufferSubData(target, (int) offset, data.limit(), data);
    }

    @Override
    public void nglGetBufferSubData(int target, long offset, long size, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, LongBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long nglMapBuffer(int target, int access) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean glUnmapBuffer(int target) {
        return GLES30.glUnmapBuffer(target);
    }

    @Override
    public void nglGetBufferParameteriv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        GLES11.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public int glGetBufferParameteri(int target, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetBufferPointerv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long glGetBufferPointer(int target, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGenQueries(int n, long ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenQueries(IntBuffer ids) {
        GLES30.glGenQueries(ids.limit(), ids);
    }

    @Override
    public int glGenQueries() {
        GLES30.glGenQueries(1, tmp_int, 0);
        return tmp_int[0];
    }

    @Override
    public void nglDeleteQueries(int n, long ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteQueries(IntBuffer ids) {
        GLES30.glDeleteQueries(ids.limit(), ids);
    }

    @Override
    public void glDeleteQueries(int id) {
        tmp_int[0] = id;
        GLES30.glDeleteQueries(1, tmp_int, 0);
    }

    @Override
    public boolean glIsQuery(int id) {
        return GLES30.glIsQuery(id);
    }

    @Override
    public void glBeginQuery(int target, int id) {
        GLES30.glBeginQuery(target, id);
    }

    @Override
    public void glEndQuery(int target) {
        GLES30.glEndQuery(target);
    }

    @Override
    public void nglGetQueryiv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryiv(int target, int pname, IntBuffer params) {
        GLES30.glGetQueryiv(target, pname, params);
    }

    @Override
    public int glGetQueryi(int target, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetQueryObjectiv(int id, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetQueryObjecti(int id, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetQueryObjectuiv(int id, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        GLES30.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, long params) {
        throw new UnsupportedOperationException(); // args
    }

    @Override
    public int glGetQueryObjectui(int id, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteBuffers(int[] buffers) {
        GLES11.glDeleteBuffers(buffers.length, buffers, 0);
    }

    @Override
    public void glGenBuffers(int[] buffers) {
        GLES11.glGenBuffers(buffers.length, buffers, 0);
    }

    @Override
    public void glBufferData(int target, short[] data, int usage) {
        GLES11.glBufferData(target, data.length, createBuffer(data), usage);
    }

    @Override
    public void glBufferData(int target, int[] data, int usage) {
        GLES11.glBufferData(target, data.length, createBuffer(data), usage);
    }

    @Override
    public void glBufferData(int target, long[] data, int usage) {
        GLES11.glBufferData(target, data.length, createBuffer(data), usage);
    }

    @Override
    public void glBufferData(int target, float[] data, int usage) {
        GLES11.glBufferData(target, data.length, createBuffer(data), usage);
    }

    @Override
    public void glBufferData(int target, double[] data, int usage) {
        GLES11.glBufferData(target, data.length, createBuffer(data), usage);
    }

    @Override
    public void glBufferSubData(int target, long offset, short[] data) {
        GLES11.glBufferSubData(target, (int) offset, data.length, createBuffer(data));
    }

    @Override
    public void glBufferSubData(int target, long offset, int[] data) {
        GLES11.glBufferSubData(target, (int) offset, data.length, createBuffer(data));
    }

    @Override
    public void glBufferSubData(int target, long offset, long[] data) {
        GLES11.glBufferSubData(target, (int) offset, data.length, createBuffer(data));
    }

    @Override
    public void glBufferSubData(int target, long offset, float[] data) {
        GLES11.glBufferSubData(target, (int) offset, data.length, createBuffer(data));
    }

    @Override
    public void glBufferSubData(int target, long offset, double[] data) {
        GLES11.glBufferSubData(target, (int) offset, data.length, createBuffer(data));
    }

    @Override
    public void glGetBufferSubData(int target, long offset, short[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, long[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferSubData(int target, long offset, double[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, int[] params) {
        GLES11.glGetBufferParameteriv(target, pname, params, 0);
    }

    @Override
    public void glGenQueries(int[] ids) {
        GLES30.glGenQueries(ids.length, ids, 0);
    }

    @Override
    public void glDeleteQueries(int[] ids) {
        GLES30.glDeleteQueries(ids.length, ids, 0);
    }

    @Override
    public void glGetQueryiv(int target, int pname, int[] params) {
        GLES30.glGetQueryiv(target, pname, params, 0);
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        GLES30.glGetQueryObjectuiv(id, pname, params, 0);
    }

}