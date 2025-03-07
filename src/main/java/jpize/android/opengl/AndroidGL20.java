package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI20;
import java.nio.*;

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
        GLES32.nglShaderSource(shader, count, strings, length);
    }

    @Override
    public void glShaderSource(int shader, CharSequence... strings) {
        GLES32.glShaderSource(shader, strings);
    }

    @Override
    public void glShaderSource(int shader, CharSequence string) {
        GLES32.glShaderSource(shader, string);
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
        GLES32.nglUniform1fv(location, count, value);
    }

    @Override
    public void glUniform1fv(int location, FloatBuffer value) {
        GLES32.glUniform1fv(location, value);
    }

    @Override
    public void nglUniform2fv(int location, int count, long value) {
        GLES32.nglUniform2fv(location, count, value);
    }

    @Override
    public void glUniform2fv(int location, FloatBuffer value) {
        GLES32.glUniform2fv(location, value);
    }

    @Override
    public void nglUniform3fv(int location, int count, long value) {
        GLES32.nglUniform3fv(location, count, value);
    }

    @Override
    public void glUniform3fv(int location, FloatBuffer value) {
        GLES32.glUniform3fv(location, value);
    }

    @Override
    public void nglUniform4fv(int location, int count, long value) {
        GLES32.nglUniform4fv(location, count, value);
    }

    @Override
    public void glUniform4fv(int location, FloatBuffer value) {
        GLES32.glUniform4fv(location, value);
    }

    @Override
    public void nglUniform1iv(int location, int count, long value) {
        GLES32.nglUniform1iv(location, count, value);
    }

    @Override
    public void glUniform1iv(int location, IntBuffer value) {
        GLES32.glUniform1iv(location, value);
    }

    @Override
    public void nglUniform2iv(int location, int count, long value) {
        GLES32.nglUniform2iv(location, count, value);
    }

    @Override
    public void glUniform2iv(int location, IntBuffer value) {
        GLES32.glUniform2iv(location, value);
    }

    @Override
    public void nglUniform3iv(int location, int count, long value) {
        GLES32.nglUniform3iv(location, count, value);
    }

    @Override
    public void glUniform3iv(int location, IntBuffer value) {
        GLES32.glUniform3iv(location, value);
    }

    @Override
    public void nglUniform4iv(int location, int count, long value) {
        GLES32.nglUniform4iv(location, count, value);
    }

    @Override
    public void glUniform4iv(int location, IntBuffer value) {
        GLES32.glUniform4iv(location, value);
    }

    @Override
    public void nglUniformMatrix2fv(int location, int count, boolean transpose, long value) {
        GLES32.nglUniformMatrix2fv(location, count, transpose, value);
    }

    @Override
    public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
        GLES32.glUniformMatrix2fv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix3fv(int location, int count, boolean transpose, long value) {
        GLES32.nglUniformMatrix3fv(location, count, transpose, value);
    }

    @Override
    public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
        GLES32.glUniformMatrix3fv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix4fv(int location, int count, boolean transpose, long value) {
        GLES32.nglUniformMatrix4fv(location, count, transpose, value);
    }

    @Override
    public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
        GLES32.glUniformMatrix4fv(location, transpose, value);
    }

    @Override
    public void nglGetShaderiv(int shader, int pname, long params) {
        GLES32.nglGetShaderiv(shader, pname, params);
    }

    @Override
    public void glGetShaderiv(int shader, int pname, IntBuffer params) {
        GLES32.glGetShaderiv(shader, pname, params);
    }

    @Override
    public int glGetShaderi(int shader, int pname) {
        return GLES32.glGetShaderi(shader, pname);
    }

    @Override
    public void nglGetProgramiv(int program, int pname, long params) {
        GLES32.nglGetProgramiv(program, pname, params);
    }

    @Override
    public void glGetProgramiv(int program, int pname, IntBuffer params) {
        GLES32.glGetProgramiv(program, pname, params);
    }

    @Override
    public int glGetProgrami(int program, int pname) {
        return GLES32.glGetProgrami(program, pname);
    }

    @Override
    public void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog) {
        GLES32.nglGetShaderInfoLog(shader, maxLength, length, infoLog);
    }

    @Override
    public void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        GLES32.glGetShaderInfoLog(shader, length, infoLog);
    }

    @Override
    public String glGetShaderInfoLog(int shader, int maxLength) {
        return GLES32.glGetShaderInfoLog(shader, maxLength);
    }

    @Override
    public String glGetShaderInfoLog(int shader) {
        return GLES32.glGetShaderInfoLog(shader);
    }

    @Override
    public void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog) {
        GLES32.nglGetProgramInfoLog(program, maxLength, length, infoLog);
    }

    @Override
    public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        GLES32.glGetProgramInfoLog(program, length, infoLog);
    }

    @Override
    public String glGetProgramInfoLog(int program, int maxLength) {
        return GLES32.glGetProgramInfoLog(program, maxLength);
    }

    @Override
    public String glGetProgramInfoLog(int program) {
        return GLES32.glGetProgramInfoLog(program);
    }

    @Override
    public void nglGetAttachedShaders(int program, int maxCount, long count, long shaders) {
        GLES32.nglGetAttachedShaders(program, maxCount, count, shaders);
    }

    @Override
    public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        GLES32.glGetAttachedShaders(program, count, shaders);
    }

    @Override
    public int nglGetUniformLocation(int program, long name) {
        return GLES32.nglGetUniformLocation(program, name);
    }

    @Override
    public int glGetUniformLocation(int program, ByteBuffer name) {
        return GLES32.glGetUniformLocation(program, name);
    }

    @Override
    public int glGetUniformLocation(int program, CharSequence name) {
        return GLES32.glGetUniformLocation(program, name);
    }

    @Override
    public void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name) {
        GLES32.nglGetActiveUniform(program, index, maxLength, length, size, type, name);
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
        GLES32.nglGetUniformfv(program, location, params);
    }

    @Override
    public void glGetUniformfv(int program, int location, FloatBuffer params) {
        GLES32.glGetUniformfv(program, location, params);
    }

    @Override
    public float glGetUniformf(int program, int location) {
        return GLES32.glGetUniformf(program, location);
    }

    @Override
    public void nglGetUniformiv(int program, int location, long params) {
        GLES32.nglGetUniformiv(program, location, params);
    }

    @Override
    public void glGetUniformiv(int program, int location, IntBuffer params) {
        GLES32.glGetUniformiv(program, location, params);
    }

    @Override
    public int glGetUniformi(int program, int location) {
        return GLES32.glGetUniformi(program, location);
    }

    @Override
    public void nglGetShaderSource(int shader, int maxLength, long length, long source) {
        GLES32.nglGetShaderSource(shader, maxLength, length, source);
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
        GLES32.glVertexAttrib1s(index, v0);
    }

    @Override
    public void glVertexAttrib1d(int index, double v0) {
        GLES32.glVertexAttrib1d(index, v0);
    }

    @Override
    public void glVertexAttrib2f(int index, float v0, float v1) {
        GLES32.glVertexAttrib2f(index, v0, v1);
    }

    @Override
    public void glVertexAttrib2s(int index, short v0, short v1) {
        GLES32.glVertexAttrib2s(index, v0, v1);
    }

    @Override
    public void glVertexAttrib2d(int index, double v0, double v1) {
        GLES32.glVertexAttrib2d(index, v0, v1);
    }

    @Override
    public void glVertexAttrib3f(int index, float v0, float v1, float v2) {
        GLES32.glVertexAttrib3f(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib3s(int index, short v0, short v1, short v2) {
        GLES32.glVertexAttrib3s(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib3d(int index, double v0, double v1, double v2) {
        GLES32.glVertexAttrib3d(index, v0, v1, v2);
    }

    @Override
    public void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
        GLES32.glVertexAttrib4f(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
        GLES32.glVertexAttrib4s(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
        GLES32.glVertexAttrib4d(index, v0, v1, v2, v3);
    }

    @Override
    public void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        GLES32.glVertexAttrib4Nub(index, x, y, z, w);
    }

    @Override
    public void nglVertexAttrib1fv(int index, long v) {
        GLES32.nglVertexAttrib1fv(index, v);
    }

    @Override
    public void glVertexAttrib1fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib1fv(index, v);
    }

    @Override
    public void nglVertexAttrib1sv(int index, long v) {
        GLES32.nglVertexAttrib1sv(index, v);
    }

    @Override
    public void glVertexAttrib1sv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib1sv(index, v);
    }

    @Override
    public void nglVertexAttrib1dv(int index, long v) {
        GLES32.nglVertexAttrib1dv(index, v);
    }

    @Override
    public void glVertexAttrib1dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttrib1dv(index, v);
    }

    @Override
    public void nglVertexAttrib2fv(int index, long v) {
        GLES32.nglVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib2fv(index, v);
    }

    @Override
    public void nglVertexAttrib2sv(int index, long v) {
        GLES32.nglVertexAttrib2sv(index, v);
    }

    @Override
    public void glVertexAttrib2sv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib2sv(index, v);
    }

    @Override
    public void nglVertexAttrib2dv(int index, long v) {
        GLES32.nglVertexAttrib2dv(index, v);
    }

    @Override
    public void glVertexAttrib2dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttrib2dv(index, v);
    }

    @Override
    public void nglVertexAttrib3fv(int index, long v) {
        GLES32.nglVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib3fv(index, v);
    }

    @Override
    public void nglVertexAttrib3sv(int index, long v) {
        GLES32.nglVertexAttrib3sv(index, v);
    }

    @Override
    public void glVertexAttrib3sv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib3sv(index, v);
    }

    @Override
    public void nglVertexAttrib3dv(int index, long v) {
        GLES32.nglVertexAttrib3dv(index, v);
    }

    @Override
    public void glVertexAttrib3dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttrib3dv(index, v);
    }

    @Override
    public void nglVertexAttrib4fv(int index, long v) {
        GLES32.nglVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, FloatBuffer v) {
        GLES32.glVertexAttrib4fv(index, v);
    }

    @Override
    public void nglVertexAttrib4sv(int index, long v) {
        GLES32.nglVertexAttrib4sv(index, v);
    }

    @Override
    public void glVertexAttrib4sv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib4sv(index, v);
    }

    @Override
    public void nglVertexAttrib4dv(int index, long v) {
        GLES32.nglVertexAttrib4dv(index, v);
    }

    @Override
    public void glVertexAttrib4dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttrib4dv(index, v);
    }

    @Override
    public void nglVertexAttrib4iv(int index, long v) {
        GLES32.nglVertexAttrib4iv(index, v);
    }

    @Override
    public void glVertexAttrib4iv(int index, IntBuffer v) {
        GLES32.glVertexAttrib4iv(index, v);
    }

    @Override
    public void nglVertexAttrib4bv(int index, long v) {
        GLES32.nglVertexAttrib4bv(index, v);
    }

    @Override
    public void glVertexAttrib4bv(int index, ByteBuffer v) {
        GLES32.glVertexAttrib4bv(index, v);
    }

    @Override
    public void nglVertexAttrib4ubv(int index, long v) {
        GLES32.nglVertexAttrib4ubv(index, v);
    }

    @Override
    public void glVertexAttrib4ubv(int index, ByteBuffer v) {
        GLES32.glVertexAttrib4ubv(index, v);
    }

    @Override
    public void nglVertexAttrib4usv(int index, long v) {
        GLES32.nglVertexAttrib4usv(index, v);
    }

    @Override
    public void glVertexAttrib4usv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib4usv(index, v);
    }

    @Override
    public void nglVertexAttrib4uiv(int index, long v) {
        GLES32.nglVertexAttrib4uiv(index, v);
    }

    @Override
    public void glVertexAttrib4uiv(int index, IntBuffer v) {
        GLES32.glVertexAttrib4uiv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nbv(int index, long v) {
        GLES32.nglVertexAttrib4Nbv(index, v);
    }

    @Override
    public void glVertexAttrib4Nbv(int index, ByteBuffer v) {
        GLES32.glVertexAttrib4Nbv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nsv(int index, long v) {
        GLES32.nglVertexAttrib4Nsv(index, v);
    }

    @Override
    public void glVertexAttrib4Nsv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib4Nsv(index, v);
    }

    @Override
    public void nglVertexAttrib4Niv(int index, long v) {
        GLES32.nglVertexAttrib4Niv(index, v);
    }

    @Override
    public void glVertexAttrib4Niv(int index, IntBuffer v) {
        GLES32.glVertexAttrib4Niv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nubv(int index, long v) {
        GLES32.nglVertexAttrib4Nubv(index, v);
    }

    @Override
    public void glVertexAttrib4Nubv(int index, ByteBuffer v) {
        GLES32.glVertexAttrib4Nubv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nusv(int index, long v) {
        GLES32.nglVertexAttrib4Nusv(index, v);
    }

    @Override
    public void glVertexAttrib4Nusv(int index, ShortBuffer v) {
        GLES32.glVertexAttrib4Nusv(index, v);
    }

    @Override
    public void nglVertexAttrib4Nuiv(int index, long v) {
        GLES32.nglVertexAttrib4Nuiv(index, v);
    }

    @Override
    public void glVertexAttrib4Nuiv(int index, IntBuffer v) {
        GLES32.glVertexAttrib4Nuiv(index, v);
    }

    @Override
    public void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer) {
        GLES32.nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
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
        GLES32.nglBindAttribLocation(program, index, name);
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
        GLES32.nglGetActiveAttrib(program, index, maxLength, length, size, type, name);
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
        return GLES32.nglGetAttribLocation(program, name);
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
        GLES32.nglGetVertexAttribiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
        GLES32.glGetVertexAttribiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribi(int index, int pname) {
        return GLES32.glGetVertexAttribi(index, pname);
    }

    @Override
    public void nglGetVertexAttribfv(int index, int pname, long params) {
        GLES32.nglGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
        GLES32.glGetVertexAttribfv(index, pname, params);
    }

    @Override
    public void nglGetVertexAttribdv(int index, int pname, long params) {
        GLES32.nglGetVertexAttribdv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribdv(int index, int pname, DoubleBuffer params) {
        GLES32.glGetVertexAttribdv(index, pname, params);
    }

    @Override
    public void nglGetVertexAttribPointerv(int index, int pname, long pointer) {
        GLES32.nglGetVertexAttribPointerv(index, pname, pointer);
    }

    @Override
    public long glGetVertexAttribPointer(int index, int pname) {
        return GLES32.glGetVertexAttribPointer(index, pname);
    }

    @Override
    public void nglDrawBuffers(int n, long bufs) {
        GLES32.nglDrawBuffers(n, bufs);
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
        GLES32.glVertexAttrib1sv(index, v);
    }

    @Override
    public void glVertexAttrib1dv(int index, double[] v) {
        GLES32.glVertexAttrib1dv(index, v);
    }

    @Override
    public void glVertexAttrib2fv(int index, float[] v) {
        GLES32.glVertexAttrib2fv(index, v);
    }

    @Override
    public void glVertexAttrib2sv(int index, short[] v) {
        GLES32.glVertexAttrib2sv(index, v);
    }

    @Override
    public void glVertexAttrib2dv(int index, double[] v) {
        GLES32.glVertexAttrib2dv(index, v);
    }

    @Override
    public void glVertexAttrib3fv(int index, float[] v) {
        GLES32.glVertexAttrib3fv(index, v);
    }

    @Override
    public void glVertexAttrib3sv(int index, short[] v) {
        GLES32.glVertexAttrib3sv(index, v);
    }

    @Override
    public void glVertexAttrib3dv(int index, double[] v) {
        GLES32.glVertexAttrib3dv(index, v);
    }

    @Override
    public void glVertexAttrib4fv(int index, float[] v) {
        GLES32.glVertexAttrib4fv(index, v);
    }

    @Override
    public void glVertexAttrib4sv(int index, short[] v) {
        GLES32.glVertexAttrib4sv(index, v);
    }

    @Override
    public void glVertexAttrib4dv(int index, double[] v) {
        GLES32.glVertexAttrib4dv(index, v);
    }

    @Override
    public void glVertexAttrib4iv(int index, int[] v) {
        GLES32.glVertexAttrib4iv(index, v);
    }

    @Override
    public void glVertexAttrib4usv(int index, short[] v) {
        GLES32.glVertexAttrib4usv(index, v);
    }

    @Override
    public void glVertexAttrib4uiv(int index, int[] v) {
        GLES32.glVertexAttrib4uiv(index, v);
    }

    @Override
    public void glVertexAttrib4Nsv(int index, short[] v) {
        GLES32.glVertexAttrib4Nsv(index, v);
    }

    @Override
    public void glVertexAttrib4Niv(int index, int[] v) {
        GLES32.glVertexAttrib4Niv(index, v);
    }

    @Override
    public void glVertexAttrib4Nusv(int index, short[] v) {
        GLES32.glVertexAttrib4Nusv(index, v);
    }

    @Override
    public void glVertexAttrib4Nuiv(int index, int[] v) {
        GLES32.glVertexAttrib4Nuiv(index, v);
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
        GLES32.glGetVertexAttribdv(index, pname, params);
    }

    @Override
    public void glDrawBuffers(int[] bufs) {
        GLES32.glDrawBuffers(bufs);
    }

}