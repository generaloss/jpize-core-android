package jpize.android.opengl;

import android.opengl.GLES32;
import jpize.opengl.gl.GLI33;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

public class AndroidGL33 extends AndroidGL32 implements GLI33 {

    @Override
    public void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int nglGetFragDataIndex(int program, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetFragDataIndex(int program, ByteBuffer name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetFragDataIndex(int program, CharSequence name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGenSamplers(int count, long samplers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenSamplers(IntBuffer samplers) {
        GLES32.glGenSamplers(samplers.limit(), samplers);
    }

    @Override
    public int glGenSamplers() {
        GLES32.glGenSamplers(1, tmp_int, 0);
        return tmp_int[0];
    }

    @Override
    public void nglDeleteSamplers(int count, long samplers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteSamplers(IntBuffer samplers) {
        GLES32.glDeleteSamplers(samplers);
    }

    @Override
    public void glDeleteSamplers(int sampler) {
        GLES32.glDeleteSamplers(sampler);
    }

    @Override
    public boolean glIsSampler(int sampler) {
        return GLES32.glIsSampler(sampler);
    }

    @Override
    public void glBindSampler(int unit, int sampler) {
        GLES32.glBindSampler(unit, sampler);
    }

    @Override
    public void glSamplerParameteri(int sampler, int pname, int param) {
        GLES32.glSamplerParameteri(sampler, pname, param);
    }

    @Override
    public void glSamplerParameterf(int sampler, int pname, float param) {
        GLES32.glSamplerParameterf(sampler, pname, param);
    }

    @Override
    public void nglSamplerParameteriv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        GLES32.glSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public void nglSamplerParameterfv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        GLES32.glSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void nglSamplerParameterIiv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
        GLES32.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override
    public void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
        GLES32.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override
    public void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
        GLES32.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public int glGetSamplerParameteri(int sampler, int pname) {
        return GLES32.glGetSamplerParameteri(sampler, pname);
    }

    @Override
    public void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
        GLES32.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public float glGetSamplerParameterf(int sampler, int pname) {
        return GLES32.glGetSamplerParameterf(sampler, pname);
    }

    @Override
    public void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
        GLES32.glGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override
    public int glGetSamplerParameterIi(int sampler, int pname) {
        return GLES32.glGetSamplerParameterIi(sampler, pname);
    }

    @Override
    public void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
        GLES32.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override
    public int glGetSamplerParameterIui(int sampler, int pname) {
        return GLES32.glGetSamplerParameterIui(sampler, pname);
    }

    @Override
    public void glQueryCounter(int id, int target) {
        GLES32.glQueryCounter(id, target);
    }

    @Override
    public void nglGetQueryObjecti64v(int id, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryObjecti64v(int id, int pname, LongBuffer params) {
        GLES32.glGetQueryObjecti64v(id, pname, params);
    }

    @Override
    public void glGetQueryObjecti64v(int id, int pname, long params) {
        GLES32.glGetQueryObjecti64v(id, pname, params);
    }

    @Override
    public long glGetQueryObjecti64(int id, int pname) {
        return GLES32.glGetQueryObjecti64(id, pname);
    }

    @Override
    public void nglGetQueryObjectui64v(int id, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryObjectui64v(int id, int pname, LongBuffer params) {
        GLES32.glGetQueryObjectui64v(id, pname, params);
    }

    @Override
    public void glGetQueryObjectui64v(int id, int pname, long params) {
        GLES32.glGetQueryObjectui64v(id, pname, params);
    }

    @Override
    public long glGetQueryObjectui64(int id, int pname) {
        return GLES32.glGetQueryObjectui64(id, pname);
    }

    @Override
    public void glVertexAttribDivisor(int index, int divisor) {
        GLES32.glVertexAttribDivisor(index, divisor);
    }

    @Override
    public void glVertexP2ui(int var0, int var1) {
        GLES32.glVertexP2ui(var0, var1);
    }

    @Override
    public void glVertexP3ui(int var0, int var1) {
        GLES32.glVertexP3ui(var0, var1);
    }

    @Override
    public void glVertexP4ui(int var0, int var1) {
        GLES32.glVertexP4ui(var0, var1);
    }

    @Override
    public void nglVertexP2uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexP2uiv(int type, IntBuffer value) {
        GLES32.glVertexP2uiv(type, value);
    }

    @Override
    public void nglVertexP3uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexP3uiv(int type, IntBuffer value) {
        GLES32.glVertexP3uiv(type, value);
    }

    @Override
    public void nglVertexP4uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexP4uiv(int type, IntBuffer value) {
        GLES32.glVertexP4uiv(type, value);
    }

    @Override
    public void glTexCoordP1ui(int var0, int var1) {
        GLES32.glTexCoordP1ui(var0, var1);
    }

    @Override
    public void glTexCoordP2ui(int var0, int var1) {
        GLES32.glTexCoordP2ui(var0, var1);
    }

    @Override
    public void glTexCoordP3ui(int var0, int var1) {
        GLES32.glTexCoordP3ui(var0, var1);
    }

    @Override
    public void glTexCoordP4ui(int var0, int var1) {
        GLES32.glTexCoordP4ui(var0, var1);
    }

    @Override
    public void nglTexCoordP1uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordP1uiv(int type, IntBuffer coords) {
        GLES32.glTexCoordP1uiv(type, coords);
    }

    @Override
    public void nglTexCoordP2uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordP2uiv(int type, IntBuffer coords) {
        GLES32.glTexCoordP2uiv(type, coords);
    }

    @Override
    public void nglTexCoordP3uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordP3uiv(int type, IntBuffer coords) {
        GLES32.glTexCoordP3uiv(type, coords);
    }

    @Override
    public void nglTexCoordP4uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordP4uiv(int type, IntBuffer coords) {
        GLES32.glTexCoordP4uiv(type, coords);
    }

    @Override
    public void glMultiTexCoordP1ui(int var0, int var1, int var2) {
        GLES32.glMultiTexCoordP1ui(var0, var1, var2);
    }

    @Override
    public void glMultiTexCoordP2ui(int var0, int var1, int var2) {
        GLES32.glMultiTexCoordP2ui(var0, var1, var2);
    }

    @Override
    public void glMultiTexCoordP3ui(int var0, int var1, int var2) {
        GLES32.glMultiTexCoordP3ui(var0, var1, var2);
    }

    @Override
    public void glMultiTexCoordP4ui(int var0, int var1, int var2) {
        GLES32.glMultiTexCoordP4ui(var0, var1, var2);
    }

    @Override
    public void nglMultiTexCoordP1uiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords) {
        GLES32.glMultiTexCoordP1uiv(texture, type, coords);
    }

    @Override
    public void nglMultiTexCoordP2uiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords) {
        GLES32.glMultiTexCoordP2uiv(texture, type, coords);
    }

    @Override
    public void nglMultiTexCoordP3uiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords) {
        GLES32.glMultiTexCoordP3uiv(texture, type, coords);
    }

    @Override
    public void nglMultiTexCoordP4uiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords) {
        GLES32.glMultiTexCoordP4uiv(texture, type, coords);
    }

    @Override
    public void glNormalP3ui(int var0, int var1) {
        GLES32.glNormalP3ui(var0, var1);
    }

    @Override
    public void nglNormalP3uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormalP3uiv(int type, IntBuffer coords) {
        GLES32.glNormalP3uiv(type, coords);
    }

    @Override
    public void glColorP3ui(int var0, int var1) {
        GLES32.glColorP3ui(var0, var1);
    }

    @Override
    public void glColorP4ui(int var0, int var1) {
        GLES32.glColorP4ui(var0, var1);
    }

    @Override
    public void nglColorP3uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorP3uiv(int type, IntBuffer color) {
        GLES32.glColorP3uiv(type, color);
    }

    @Override
    public void nglColorP4uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorP4uiv(int type, IntBuffer color) {
        GLES32.glColorP4uiv(type, color);
    }

    @Override
    public void glSecondaryColorP3ui(int var0, int var1) {
        GLES32.glSecondaryColorP3ui(var0, var1);
    }

    @Override
    public void nglSecondaryColorP3uiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSecondaryColorP3uiv(int type, IntBuffer color) {
        GLES32.glSecondaryColorP3uiv(type, color);
    }

    @Override
    public void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
        GLES32.glVertexAttribP1ui(index, type, normalized, value);
    }

    @Override
    public void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
        GLES32.glVertexAttribP2ui(index, type, normalized, value);
    }

    @Override
    public void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
        GLES32.glVertexAttribP3ui(index, type, normalized, value);
    }

    @Override
    public void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
        GLES32.glVertexAttribP4ui(index, type, normalized, value);
    }

    @Override
    public void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value) {
        GLES32.glVertexAttribP1uiv(index, type, normalized, value);
    }

    @Override
    public void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value) {
        GLES32.glVertexAttribP2uiv(index, type, normalized, value);
    }

    @Override
    public void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value) {
        GLES32.glVertexAttribP3uiv(index, type, normalized, value);
    }

    @Override
    public void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value) {
        GLES32.glVertexAttribP4uiv(index, type, normalized, value);
    }

    @Override
    public void glGenSamplers(int[] samplers) {
        GLES32.glGenSamplers(samplers);
    }

    @Override
    public void glDeleteSamplers(int[] samplers) {
        GLES32.glDeleteSamplers(samplers);
    }

    @Override
    public void glSamplerParameteriv(int sampler, int pname, int[] params) {
        GLES32.glSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public void glSamplerParameterfv(int sampler, int pname, float[] params) {
        GLES32.glSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void glSamplerParameterIiv(int sampler, int pname, int[] params) {
        GLES32.glSamplerParameterIiv(sampler, pname, params);
    }

    @Override
    public void glSamplerParameterIuiv(int sampler, int pname, int[] params) {
        GLES32.glSamplerParameterIuiv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
        GLES32.glGetSamplerParameteriv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
        GLES32.glGetSamplerParameterfv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameterIiv(int sampler, int pname, int[] params) {
        GLES32.glGetSamplerParameterIiv(sampler, pname, params);
    }

    @Override
    public void glGetSamplerParameterIuiv(int sampler, int pname, int[] params) {
        GLES32.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    @Override
    public void glGetQueryObjecti64v(int id, int pname, long[] params) {
        GLES32.glGetQueryObjecti64v(id, pname, params);
    }

    @Override
    public void glGetQueryObjectui64v(int id, int pname, long[] params) {
        GLES32.glGetQueryObjectui64v(id, pname, params);
    }

    @Override
    public void glVertexP2uiv(int type, int[] value) {
        GLES32.glVertexP2uiv(type, value);
    }

    @Override
    public void glVertexP3uiv(int type, int[] value) {
        GLES32.glVertexP3uiv(type, value);
    }

    @Override
    public void glVertexP4uiv(int type, int[] value) {
        GLES32.glVertexP4uiv(type, value);
    }

    @Override
    public void glTexCoordP1uiv(int type, int[] coords) {
        GLES32.glTexCoordP1uiv(type, coords);
    }

    @Override
    public void glTexCoordP2uiv(int type, int[] coords) {
        GLES32.glTexCoordP2uiv(type, coords);
    }

    @Override
    public void glTexCoordP3uiv(int type, int[] coords) {
        GLES32.glTexCoordP3uiv(type, coords);
    }

    @Override
    public void glTexCoordP4uiv(int type, int[] coords) {
        GLES32.glTexCoordP4uiv(type, coords);
    }

    @Override
    public void glMultiTexCoordP1uiv(int texture, int type, int[] coords) {
        GLES32.glMultiTexCoordP1uiv(texture, type, coords);
    }

    @Override
    public void glMultiTexCoordP2uiv(int texture, int type, int[] coords) {
        GLES32.glMultiTexCoordP2uiv(texture, type, coords);
    }

    @Override
    public void glMultiTexCoordP3uiv(int texture, int type, int[] coords) {
        GLES32.glMultiTexCoordP3uiv(texture, type, coords);
    }

    @Override
    public void glMultiTexCoordP4uiv(int texture, int type, int[] coords) {
        GLES32.glMultiTexCoordP4uiv(texture, type, coords);
    }

    @Override
    public void glNormalP3uiv(int type, int[] coords) {
        GLES32.glNormalP3uiv(type, coords);
    }

    @Override
    public void glColorP3uiv(int type, int[] color) {
        GLES32.glColorP3uiv(type, color);
    }

    @Override
    public void glColorP4uiv(int type, int[] color) {
        GLES32.glColorP4uiv(type, color);
    }

    @Override
    public void glSecondaryColorP3uiv(int type, int[] color) {
        GLES32.glSecondaryColorP3uiv(type, color);
    }

    @Override
    public void glVertexAttribP1uiv(int index, int type, boolean normalized, int[] value) {
        GLES32.glVertexAttribP1uiv(index, type, normalized, value);
    }

    @Override
    public void glVertexAttribP2uiv(int index, int type, boolean normalized, int[] value) {
        GLES32.glVertexAttribP2uiv(index, type, normalized, value);
    }

    @Override
    public void glVertexAttribP3uiv(int index, int type, boolean normalized, int[] value) {
        GLES32.glVertexAttribP3uiv(index, type, normalized, value);
    }

    @Override
    public void glVertexAttribP4uiv(int index, int type, boolean normalized, int[] value) {
        GLES32.glVertexAttribP4uiv(index, type, normalized, value);
    }

}