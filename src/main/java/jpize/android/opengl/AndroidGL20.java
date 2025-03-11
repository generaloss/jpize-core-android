package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI20;
import java.nio.*;
import java.nio.charset.StandardCharsets;

public class AndroidGL20 extends AndroidGL15 implements GLI20 {

    @Override
    public int glCreateProgram() {
        return GLES32.glCreateProgram();
    }

    @Override
    public void glDeleteProgram(int program) {
        GLES32.glDeleteProgram(program);
    }

    @Override
    public boolean glIsProgram(int program) {
        return GLES32.glIsProgram(program);
    }

    @Override
    public int glCreateShader(int type) {
        return GLES32.glCreateShader(type);
    }

    @Override
    public void glDeleteShader(int shader) {
        GLES32.glDeleteShader(shader);
    }

    @Override
    public boolean glIsShader(int shader) {
        return GLES32.glIsShader(shader);
    }

    @Override
    public void glAttachShader(int program, int shader) {
        GLES32.glAttachShader(program, shader);
    }

    @Override
    public void glDetachShader(int program, int shader) {
        GLES32.glDetachShader(program, shader);
    }

    @Override
    public void nglShaderSource(int shader, int count, long strings, long length) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glShaderSource(int shader, CharSequence... strings) {
        final StringBuilder string = new StringBuilder();
        for(CharSequence charSequence: strings)
            string.append(charSequence);
        GLES32.glShaderSource(shader, string.toString());
    }

    @Override
    public void glShaderSource(int shader, CharSequence string) {
        GLES32.glShaderSource(shader, string.toString());
    }

    @Override
    public void glCompileShader(int shader) {
        GLES32.glCompileShader(shader);
    }

    @Override
    public void glLinkProgram(int program) {
        GLES32.glLinkProgram(program);
    }

    @Override
    public void glUseProgram(int program) {
        GLES32.glUseProgram(program);
    }

    @Override
    public void glValidateProgram(int program) {
        GLES32.glValidateProgram(program);
    }

    @Override
    public void glUniform1f(int location, float v0) {
        GLES32.glUniform1f(location, v0);
    }

    @Override
    public void glUniform2f(int location, float v0, float v1) {
        GLES32.glUniform2f(location, v0, v1);
    }

    @Override
    public void glUniform3f(int location, float v0, float v1, float v2) {
        GLES32.glUniform3f(location, v0, v1, v2);
    }

    @Override
    public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        GLES32.glUniform4f(location, v0, v1, v2, v3);
    }

    @Override
    public void glUniform1i(int location, int v0) {
        GLES32.glUniform1i(location, v0);
    }

    @Override
    public void glUniform2i(int location, int v0, int v1) {
        GLES32.glUniform2i(location, v0, v1);
    }

    @Override
    public void glUniform3i(int location, int v0, int v1, int v2) {
        GLES32.glUniform3i(location, v0, v1, v2);
    }

    @Override
    public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        GLES32.glUniform4i(location, v0, v1, v2, v3);
    }

    @Override
    public void nglUniform1fv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform1fv(int location, FloatBuffer value) {
        GLES32.glUniform1fv(location, value.limit(), value);
    }

    @Override
    public void nglUniform2fv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform2fv(int location, FloatBuffer value) {
        GLES32.glUniform2fv(location, value.limit(), value);
    }

    @Override
    public void nglUniform3fv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform3fv(int location, FloatBuffer value) {
        GLES32.glUniform3fv(location, value.limit(), value);
    }

    @Override
    public void nglUniform4fv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform4fv(int location, FloatBuffer value) {
        GLES32.glUniform4fv(location, value.limit(), value);
    }

    @Override
    public void nglUniform1iv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform1iv(int location, IntBuffer value) {
        GLES32.glUniform1iv(location, value.limit(), value);
    }

    @Override
    public void nglUniform2iv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform2iv(int location, IntBuffer value) {
        GLES32.glUniform2iv(location, value.limit(), value);
    }

    @Override
    public void nglUniform3iv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform3iv(int location, IntBuffer value) {
        GLES32.glUniform3iv(location, value.limit(), value);
    }

    @Override
    public void nglUniform4iv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform4iv(int location, IntBuffer value) {
        GLES32.glUniform4iv(location, value.limit(), value);
    }

    @Override
    public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        GLES32.glUniformMatrix2fv(location, value.limit(), transpose, value);
    }

    @Override
    public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        GLES32.glUniformMatrix3fv(location, value.limit(), transpose, value);
    }

    @Override
    public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        GLES32.glUniformMatrix4fv(location, value.limit(), transpose, value);
    }

    @Override
    public void nglGetShaderiv(int shader, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        GLES32.glGetShaderiv(shader, pname, params);
    }

    @Override
    public int glGetShaderi(int shader, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetProgramiv(int program, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramiv(int program, int pname, IntBuffer params) {
        GLES32.glGetProgramiv(program, pname, params);
    }

    @Override
    public int glGetProgrami(int program, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        final int maxLength = length.get();
        String log = GLES32.glGetShaderInfoLog(shader);
        if(log.length() > maxLength)
            log = log.substring(0, maxLength);
        infoLog.put(log.getBytes());
        infoLog.position(0);
    }

    @Override
    public String glGetShaderInfoLog(int shader, int maxLength) {
        final String log = GLES32.glGetShaderInfoLog(shader);
        if(log.length() > maxLength)
            return log.substring(0, maxLength);
        return log;
    }

    @Override
    public String glGetShaderInfoLog(int shader) {
        return GLES32.glGetShaderInfoLog(shader);
    }

    @Override
    public void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        final int maxLength = length.get();
        String log = GLES32.glGetProgramInfoLog(program);
        if(log.length() > maxLength)
            log = log.substring(0, maxLength);
        infoLog.put(log.getBytes());
        infoLog.position(0);
    }

    @Override
    public String glGetProgramInfoLog(int program, int maxLength) {
        final String log = GLES32.glGetProgramInfoLog(program);
        if(log.length() > maxLength)
            return log.substring(0, maxLength);
        return log;
    }

    @Override
    public String glGetProgramInfoLog(int program) {
        return GLES32.glGetProgramInfoLog(program);
    }

    @Override
    public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        GLES32.glGetAttachedShaders(program, count.limit(), count, shaders);
    }

    @Override
    public int nglGetUniformLocation(int program, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetUniformLocation(int program, ByteBuffer name) {
        final String stringName = StandardCharsets.UTF_8.decode(name).toString();
        return GLES32.glGetUniformLocation(program, stringName);
    }

    @Override
    public int glGetUniformLocation(int program, CharSequence name) {
        return GLES32.glGetUniformLocation(program, name.toString());
    }

    @Override
    public void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GLES32.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveUniform(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return GLES32.glGetActiveUniform(program, index, maxLength, size, type);
    }

    @Override
    public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
        return GLES32.glGetActiveUniform(program, index, size, type);
    }

    @Override
    public void nglGetUniformfv(int program, int location, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetUniformfv(int program, int location, FloatBuffer params) {
        GLES32.glGetUniformfv(program, location, params);
    }

    @Override
    public float glGetUniformf(int program, int location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetUniformiv(int program, int location, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetUniformiv(int program, int location, IntBuffer params) {
        GLES32.glGetUniformiv(program, location, params);
    }

    @Override
    public int glGetUniformi(int program, int location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
        GLES32.glGetShaderSource(shader, length, source);
    }

    @Override
    public String glGetShaderSource(int shader, int maxLength) {
        return GLES32.glGetShaderSource(shader, maxLength);
    }

    @Override
    public String glGetShaderSource(int shader) {
        return GLES32.glGetShaderSource(shader);
    }

    @Override
    public void glVertexAttrib1f(int index, float v0) {
        GLES32.glVertexAttrib1f(index, v0);
    }

    @Override
    public void glVertexAttrib1s(int index, short v0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib1d(int index, double v0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2f(int index, float v0, float v1) {
        GLES32.glVertexAttrib2f(index, v0, v1);
    }

    @Override
    public void glVertexAttrib2s(int index, short v0, short v1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2d(int index, double v0, double v1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3f(int index, float v0, float v1, float v2) {
        GLES32.glVertexAttrib3f(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib3s(int index, short v0, short v1, short v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3d(int index, double v0, double v1, double v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
        GLES32.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib1fv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib1fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib1fv(index, v);
    }

    @Override
    public void nglVertexAttrib1sv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib1sv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib1dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib1dv(int index, DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib2fv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib2fv(index, v);
    }

    @Override
    public void nglVertexAttrib2sv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2sv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib2dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2dv(int index, DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib3fv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib3fv(index, v);
    }

    @Override
    public void nglVertexAttrib3sv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3sv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib3dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3dv(int index, DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4fv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib4fv(index, v);
    }

    @Override
    public void nglVertexAttrib4sv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4sv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4dv(int index, DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4iv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4iv(int index, IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4bv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4bv(int index, ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4ubv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4ubv(int index, ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4usv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4usv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4uiv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4uiv(int index, IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4Nbv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nbv(int index, ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4Nsv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nsv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4Niv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Niv(int index, IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4Nubv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nubv(int index, ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4Nusv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nusv(int index, ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttrib4Nuiv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nuiv(int index, IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
        GLES32.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GLES32.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
        GLES32.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
        GLES32.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
        GLES32.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    @Override
    public void glEnableVertexAttribArray(int index) {
        GLES32.glEnableVertexAttribArray(index);
    }

    @Override
    public void glDisableVertexAttribArray(int index) {
        GLES32.glDisableVertexAttribArray(index);
    }

    @Override
    public void nglBindAttribLocation(int program, int index, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindAttribLocation(int program, int index, ByteBuffer name) {
        GLES32.glBindAttribLocation(program, index, name);
    }

    @Override
    public void glBindAttribLocation(int program, int index, CharSequence name) {
        GLES32.glBindAttribLocation(program, index, name);
    }

    @Override
    public void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GLES32.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer size, IntBuffer type) {
        return GLES32.glGetActiveAttrib(program, index, maxLength, size, type);
    }

    @Override
    public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
        return GLES32.glGetActiveAttrib(program, index, size, type);
    }

    @Override
    public int nglGetAttribLocation(int program, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetAttribLocation(int program, ByteBuffer name) {
        return GLES32.glGetAttribLocation(program, name);
    }

    @Override
    public int glGetAttribLocation(int program, CharSequence name) {
        return GLES32.glGetAttribLocation(program, name);
    }

    @Override
    public void nglGetVertexAttribiv(int index, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        GLES32.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribi(int index, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetVertexAttribfv(int index, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        GLES32.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void nglGetVertexAttribdv(int index, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long glGetVertexAttribPointer(int index, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglDrawBuffers(int n, long bufs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawBuffers(IntBuffer bufs) {
        GLES32.glDrawBuffers(bufs);
    }

    @Override
    public void glDrawBuffers(int buf) {
        GLES32.glDrawBuffers(buf);
    }

    @Override
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        GLES32.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Override
    public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        GLES32.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    @Override
    public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        GLES32.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Override
    public void glStencilMaskSeparate(int face, int mask) {
        GLES32.glStencilMaskSeparate(face, mask);
    }

    @Override
    public void glUniform1fv(int location, float[] value) {
        GLES32.glUniform1fv(location, value);
    }

    @Override
    public void glUniform2fv(int location, float[] value) {
        GLES32.glUniform2fv(location, value);
    }

    @Override
    public void glUniform3fv(int location, float[] value) {
        GLES32.glUniform3fv(location, value);
    }

    @Override
    public void glUniform4fv(int location, float[] value) {
        GLES32.glUniform4fv(location, value);
    }

    @Override
    public void glUniform1iv(int location, int[] value) {
        GLES32.glUniform1iv(location, value);
    }

    @Override
    public void glUniform2iv(int location, int[] value) {
        GLES32.glUniform2iv(location, value);
    }

    @Override
    public void glUniform3iv(int location, int[] value) {
        GLES32.glUniform3iv(location, value);
    }

    @Override
    public void glUniform4iv(int location, int[] value) {
        GLES32.glUniform4iv(location, value);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, float[] value) {
        GLES32.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, float[] value) {
        GLES32.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, float[] value) {
        GLES32.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, int[] params) {
        GLES32.glGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetProgramiv(int program, int pname, int[] params) {
        GLES32.glGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetShaderInfoLog(int shader, int[] length, ByteBuffer infoLog) {
        GLES32.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public void glGetProgramInfoLog(int program, int[] length, ByteBuffer infoLog) {
        GLES32.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public void glGetAttachedShaders(int program, int[] count, int[] shaders) {
        GLES32.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public void glGetActiveUniform(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GLES32.glGetActiveUniform(program, index, length, size, type, name);
    }

    @Override
    public void glGetUniformfv(int program, int location, float[] params) {
        GLES32.glGetUniformfv(program, location, params);
    }

    @Override
    public void glGetUniformiv(int program, int location, int[] params) {
        GLES32.glGetUniformiv(program, location, params);
    }

    @Override
    public void glGetShaderSource(int shader, int[] length, ByteBuffer source) {
        GLES32.glGetShaderSource(shader, length, source);
    }

    @Override
    public void glVertexAttrib1fv(int index, float[] v) {
        GLES32.glVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib1sv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib1dv(int index, double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2fv(int index, float[] v) {
        GLES32.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2sv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib2dv(int index, double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3fv(int index, float[] v) {
        GLES32.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3sv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib3dv(int index, double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4fv(int index, float[] v) {
        GLES32.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4sv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4dv(int index, double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4iv(int index, int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4usv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4uiv(int index, int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nsv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Niv(int index, int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nusv(int index, short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttrib4Nuiv(int index, int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveAttrib(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GLES32.glGetActiveAttrib(program, index, length, size, type, name);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, int[] params) {
        GLES32.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, float[] params) {
        GLES32.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribdv(int index, int pname, double[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawBuffers(int[] bufs) {
        GLES32.glDrawBuffers(bufs);
    }

}