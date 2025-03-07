package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI15;
import java.nio.*;

public class AndroidGL15 extends AndroidGL14 implements GLI15 {

    @Override
    public void glBindBuffer(int target, int buffer) {
        GLES32.glBindBuffer(target, buffer);
    }

    @Override
    public void nglDeleteBuffers(int n, long buffers) {
        GLES32.nglDeleteBuffers(n, buffers);
    }

    @Override
    public void glDeleteBuffers(IntBuffer buffers) {
        GLES32.glDeleteBuffers(buffers);
    }

    @Override
    public void glDeleteBuffers(int buffer) {
        GLES32.glDeleteBuffers(buffer);
    }

    @Override
    public void nglGenBuffers(int n, long buffers) {
        GLES32.nglGenBuffers(n, buffers);
    }

    @Override
    public void glGenBuffers(IntBuffer buffers) {
        GLES32.glGenBuffers(buffers);
    }

    @Override
    public int glGenBuffers() {
        return GLES32.glGenBuffers();
    }

    @Override
    public boolean glIsBuffer(int buffer) {
        return GLES32.glIsBuffer(buffer);
    }

    @Override
    public void nglBufferData(int target, long size, long data, int usage) {
        GLES32.nglBufferData(target, size, data, usage);
    }

    @Override
    public void glBufferData(int target, long size, int usage) {
        GLES32.glBufferData(target, size, usage);
    }

    @Override
    public void glBufferData(int target, ByteBuffer data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, ShortBuffer data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, IntBuffer data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, LongBuffer data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, FloatBuffer data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, DoubleBuffer data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void nglBufferSubData(int target, long offset, long size, long data) {
        GLES32.nglBufferSubData(target, offset, size, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, ByteBuffer data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, ShortBuffer data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, IntBuffer data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, LongBuffer data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, FloatBuffer data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, DoubleBuffer data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void nglGetBufferSubData(int target, long offset, long size, long data) {
        GLES32.nglGetBufferSubData(target, offset, size, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, IntBuffer data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, LongBuffer data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public long nglMapBuffer(int target, int access) {
        return GLES32.nglMapBuffer(target, access);
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access) {
        return GLES32.glMapBuffer(target, access);
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
        return GLES32.glMapBuffer(target, access, old_buffer);
    }

    @Override
    public ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
        return GLES32.glMapBuffer(target, access, length, old_buffer);
    }

    @Override
    public boolean glUnmapBuffer(int target) {
        return GLES32.glUnmapBuffer(target);
    }

    @Override
    public void nglGetBufferParameteriv(int target, int pname, long params) {
        GLES32.nglGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
        GLES32.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public int glGetBufferParameteri(int target, int pname) {
        return GLES32.glGetBufferParameteri(target, pname);
    }

    @Override
    public void nglGetBufferPointerv(int target, int pname, long params) {
        GLES32.nglGetBufferPointerv(target, pname, params);
    }

    @Override
    public long glGetBufferPointer(int target, int pname) {
        return GLES32.glGetBufferPointer(target, pname);
    }

    @Override
    public void nglGenQueries(int n, long ids) {
        GLES32.nglGenQueries(n, ids);
    }

    @Override
    public void glGenQueries(IntBuffer ids) {
        GLES32.glGenQueries(ids);
    }

    @Override
    public int glGenQueries() {
        return GLES32.glGenQueries();
    }

    @Override
    public void nglDeleteQueries(int n, long ids) {
        GLES32.nglDeleteQueries(n, ids);
    }

    @Override
    public void glDeleteQueries(IntBuffer ids) {
        GLES32.glDeleteQueries(ids);
    }

    @Override
    public void glDeleteQueries(int id) {
        GLES32.glDeleteQueries(id);
    }

    @Override
    public boolean glIsQuery(int id) {
        return GLES32.glIsQuery(id);
    }

    @Override
    public void glBeginQuery(int target, int id) {
        GLES32.glBeginQuery(target, id);
    }

    @Override
    public void glEndQuery(int target) {
        GLES32.glEndQuery(target);
    }

    @Override
    public void nglGetQueryiv(int target, int pname, long params) {
        GLES32.nglGetQueryiv(target, pname, params);
    }

    @Override
    public void glGetQueryiv(int target, int pname, IntBuffer params) {
        GLES32.glGetQueryiv(target, pname, params);
    }

    @Override
    public int glGetQueryi(int target, int pname) {
        return GLES32.glGetQueryi(target, pname);
    }

    @Override
    public void nglGetQueryObjectiv(int id, int pname, long params) {
        GLES32.nglGetQueryObjectiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, IntBuffer params) {
        GLES32.glGetQueryObjectiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, long params) {
        GLES32.glGetQueryObjectiv(id, pname, params);
    }

    @Override
    public int glGetQueryObjecti(int id, int pname) {
        return GLES32.glGetQueryObjecti(id, pname);
    }

    @Override
    public void nglGetQueryObjectuiv(int id, int pname, long params) {
        GLES32.nglGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, IntBuffer params) {
        GLES32.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, long params) {
        GLES32.glGetQueryObjectuiv(id, pname, params);
    }

    @Override
    public int glGetQueryObjectui(int id, int pname) {
        return GLES32.glGetQueryObjectui(id, pname);
    }

    @Override
    public void glDeleteBuffers(int[] buffers) {
        GLES32.glDeleteBuffers(buffers);
    }

    @Override
    public void glGenBuffers(int[] buffers) {
        GLES32.glGenBuffers(buffers);
    }

    @Override
    public void glBufferData(int target, short[] data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, int[] data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, long[] data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, float[] data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferData(int target, double[] data, int usage) {
        GLES32.glBufferData(target, data, usage);
    }

    @Override
    public void glBufferSubData(int target, long offset, short[] data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, int[] data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, long[] data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, float[] data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glBufferSubData(int target, long offset, double[] data) {
        GLES32.glBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, short[] data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, int[] data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, long[] data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, float[] data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferSubData(int target, long offset, double[] data) {
        GLES32.glGetBufferSubData(target, offset, data);
    }

    @Override
    public void glGetBufferParameteriv(int target, int pname, int[] params) {
        GLES32.glGetBufferParameteriv(target, pname, params);
    }

    @Override
    public void glGenQueries(int[] ids) {
        GLES32.glGenQueries(ids);
    }

    @Override
    public void glDeleteQueries(int[] ids) {
        GLES32.glDeleteQueries(ids);
    }

    @Override
    public void glGetQueryiv(int target, int pname, int[] params) {
        GLES32.glGetQueryiv(target, pname, params);
    }

    @Override
    public void glGetQueryObjectiv(int id, int pname, int[] params) {
        GLES32.glGetQueryObjectiv(id, pname, params);
    }

    @Override
    public void glGetQueryObjectuiv(int id, int pname, int[] params) {
        GLES32.glGetQueryObjectuiv(id, pname, params);
    }

}