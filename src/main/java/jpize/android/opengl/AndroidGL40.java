package jpize.android.opengl;

import android.opengl.GLES32;
import jpize.opengl.gl.GLI40;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class AndroidGL40 extends AndroidGL33 implements GLI40 {

    @Override
    public void glBlendEquationi(int buf, int mode) {
        GLES32.glBlendEquationi(buf, mode);
    }

    @Override
    public void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        GLES32.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
    }

    @Override
    public void glBlendFunci(int buf, int sfactor, int dfactor) {
        GLES32.glBlendFunci(buf, sfactor, dfactor);
    }

    @Override
    public void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        GLES32.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    @Override
    public void nglDrawArraysIndirect(int mode, long indirect) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawArraysIndirect(int mode, ByteBuffer indirect) {
        GLES32.glDrawArraysIndirect(mode, indirect);
    }

    @Override
    public void glDrawArraysIndirect(int mode, long indirect) {
        GLES32.glDrawArraysIndirect(mode, indirect);
    }

    @Override
    public void glDrawArraysIndirect(int mode, IntBuffer indirect) {
        GLES32.glDrawArraysIndirect(mode, indirect);
    }

    @Override
    public void nglDrawElementsIndirect(int mode, int type, long indirect) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawElementsIndirect(int mode, int type, ByteBuffer indirect) {
        GLES32.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override
    public void glDrawElementsIndirect(int mode, int type, long indirect) {
        GLES32.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override
    public void glDrawElementsIndirect(int mode, int type, IntBuffer indirect) {
        GLES32.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override
    public void glUniform1d(int location, double x) {
        GLES32.glUniform1d(location, x);
    }

    @Override
    public void glUniform2d(int location, double x, double y) {
        GLES32.glUniform2d(location, x, y);
    }

    @Override
    public void glUniform3d(int location, double x, double y, double z) {
        GLES32.glUniform3d(location, x, y, z);
    }

    @Override
    public void glUniform4d(int location, double x, double y, double z, double w) {
        GLES32.glUniform4d(location, x, y, z, w);
    }

    @Override
    public void nglUniform1dv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform1dv(int location, DoubleBuffer value) {
        GLES32.glUniform1dv(location, value);
    }

    @Override
    public void nglUniform2dv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform2dv(int location, DoubleBuffer value) {
        GLES32.glUniform2dv(location, value);
    }

    @Override
    public void nglUniform3dv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform3dv(int location, DoubleBuffer value) {
        GLES32.glUniform3dv(location, value);
    }

    @Override
    public void nglUniform4dv(int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniform4dv(int location, DoubleBuffer value) {
        GLES32.glUniform4dv(location, value);
    }

    @Override
    public void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix2dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix2dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix3dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix3dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix4dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix4dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix2x3dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix2x3dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix2x4dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix2x4dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix3x2dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix3x2dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix3x4dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix3x4dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix4x2dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix4x2dv(location, transpose, value);
    }

    @Override
    public void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformMatrix4x3dv(int location, boolean transpose, DoubleBuffer value) {
        GLES32.glUniformMatrix4x3dv(location, transpose, value);
    }

    @Override
    public void nglGetUniformdv(int program, int location, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetUniformdv(int program, int location, DoubleBuffer params) {
        GLES32.glGetUniformdv(program, location, params);
    }

    @Override
    public double glGetUniformd(int program, int location) {
        return GLES32.glGetUniformd(program, location);
    }

    @Override
    public void glMinSampleShading(float value) {
        GLES32.glMinSampleShading(value);
    }

    @Override
    public int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetSubroutineUniformLocation(int program, int shadertype, ByteBuffer name) {
        return GLES32.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    @Override
    public int glGetSubroutineUniformLocation(int program, int shadertype, CharSequence name) {
        return GLES32.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    @Override
    public int nglGetSubroutineIndex(int program, int shadertype, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetSubroutineIndex(int program, int shadertype, ByteBuffer name) {
        return GLES32.glGetSubroutineIndex(program, shadertype, name);
    }

    @Override
    public int glGetSubroutineIndex(int program, int shadertype, CharSequence name) {
        return GLES32.glGetSubroutineIndex(program, shadertype, name);
    }

    @Override
    public void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, IntBuffer values) {
        GLES32.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override
    public int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
        return GLES32.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    @Override
    public void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
        GLES32.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    @Override
    public String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
        return GLES32.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

    @Override
    public String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
        return GLES32.glGetActiveSubroutineUniformName(program, shadertype, index);
    }

    @Override
    public void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetActiveSubroutineName(int program, int shadertype, int index, IntBuffer length, ByteBuffer name) {
        GLES32.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    @Override
    public String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
        return GLES32.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    @Override
    public String glGetActiveSubroutineName(int program, int shadertype, int index) {
        return GLES32.glGetActiveSubroutineName(program, shadertype, index);
    }

    @Override
    public void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glUniformSubroutinesuiv(int shadertype, IntBuffer indices) {
        GLES32.glUniformSubroutinesuiv(shadertype, indices);
    }

    @Override
    public void glUniformSubroutinesui(int shadertype, int index) {
        GLES32.glUniformSubroutinesui(shadertype, index);
    }

    @Override
    public void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetUniformSubroutineuiv(int shadertype, int location, IntBuffer params) {
        GLES32.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override
    public int glGetUniformSubroutineui(int shadertype, int location) {
        return GLES32.glGetUniformSubroutineui(shadertype, location);
    }

    @Override
    public void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramStageiv(int program, int shadertype, int pname, IntBuffer values) {
        GLES32.glGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override
    public int glGetProgramStagei(int program, int shadertype, int pname) {
        return GLES32.glGetProgramStagei(program, shadertype, pname);
    }

    @Override
    public void glPatchParameteri(int pname, int value) {
        GLES32.glPatchParameteri(pname, value);
    }

    @Override
    public void nglPatchParameterfv(int pname, long values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPatchParameterfv(int pname, FloatBuffer values) {
        GLES32.glPatchParameterfv(pname, values);
    }

    @Override
    public void glBindTransformFeedback(int target, int id) {
        GLES32.glBindTransformFeedback(target, id);
    }

    @Override
    public void nglDeleteTransformFeedbacks(int n, long ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteTransformFeedbacks(IntBuffer ids) {
        GLES32.glDeleteTransformFeedbacks(ids);
    }

    @Override
    public void glDeleteTransformFeedbacks(int id) {
        GLES32.glDeleteTransformFeedbacks(id);
    }

    @Override
    public void nglGenTransformFeedbacks(int n, long ids) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenTransformFeedbacks(IntBuffer ids) {
        GLES32.glGenTransformFeedbacks(ids);
    }

    @Override
    public int glGenTransformFeedbacks() {
        return GLES32.glGenTransformFeedbacks();
    }

    @Override
    public boolean glIsTransformFeedback(int id) {
        return GLES32.glIsTransformFeedback(id);
    }

    @Override
    public void glPauseTransformFeedback() {
        GLES32.glPauseTransformFeedback();
    }

    @Override
    public void glResumeTransformFeedback() {
        GLES32.glResumeTransformFeedback();
    }

    @Override
    public void glDrawTransformFeedback(int mode, int id) {
        GLES32.glDrawTransformFeedback(mode, id);
    }

    @Override
    public void glDrawTransformFeedbackStream(int mode, int id, int stream) {
        GLES32.glDrawTransformFeedbackStream(mode, id, stream);
    }

    @Override
    public void glBeginQueryIndexed(int target, int index, int id) {
        GLES32.glBeginQueryIndexed(target, index, id);
    }

    @Override
    public void glEndQueryIndexed(int target, int index) {
        GLES32.glEndQueryIndexed(target, index);
    }

    @Override
    public void nglGetQueryIndexediv(int target, int index, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetQueryIndexediv(int target, int index, int pname, IntBuffer params) {
        GLES32.glGetQueryIndexediv(target, index, pname, params);
    }

    @Override
    public int glGetQueryIndexedi(int target, int index, int pname) {
        return GLES32.glGetQueryIndexedi(target, index, pname);
    }

    @Override
    public void glDrawArraysIndirect(int mode, int[] indirect) {
        GLES32.glDrawArraysIndirect(mode, indirect);
    }

    @Override
    public void glDrawElementsIndirect(int mode, int type, int[] indirect) {
        GLES32.glDrawElementsIndirect(mode, type, indirect);
    }

    @Override
    public void glUniform1dv(int location, double[] value) {
        GLES32.glUniform1dv(location, value);
    }

    @Override
    public void glUniform2dv(int location, double[] value) {
        GLES32.glUniform2dv(location, value);
    }

    @Override
    public void glUniform3dv(int location, double[] value) {
        GLES32.glUniform3dv(location, value);
    }

    @Override
    public void glUniform4dv(int location, double[] value) {
        GLES32.glUniform4dv(location, value);
    }

    @Override
    public void glUniformMatrix2dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix2dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix3dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix4dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x3dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix2x3dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix2x4dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix2x4dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x2dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix3x2dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix3x4dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix3x4dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x2dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix4x2dv(location, transpose, value);
    }

    @Override
    public void glUniformMatrix4x3dv(int location, boolean transpose, double[] value) {
        GLES32.glUniformMatrix4x3dv(location, transpose, value);
    }

    @Override
    public void glGetUniformdv(int program, int location, double[] params) {
        GLES32.glGetUniformdv(program, location, params);
    }

    @Override
    public void glGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, int[] values) {
        GLES32.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    @Override
    public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int[] length, ByteBuffer name) {
        GLES32.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    @Override
    public void glGetActiveSubroutineName(int program, int shadertype, int index, int[] length, ByteBuffer name) {
        GLES32.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    @Override
    public void glUniformSubroutinesuiv(int shadertype, int[] indices) {
        GLES32.glUniformSubroutinesuiv(shadertype, indices);
    }

    @Override
    public void glGetUniformSubroutineuiv(int shadertype, int location, int[] params) {
        GLES32.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    @Override
    public void glGetProgramStageiv(int program, int shadertype, int pname, int[] values) {
        GLES32.glGetProgramStageiv(program, shadertype, pname, values);
    }

    @Override
    public void glPatchParameterfv(int pname, float[] values) {
        GLES32.glPatchParameterfv(pname, values);
    }

    @Override
    public void glDeleteTransformFeedbacks(int[] ids) {
        GLES32.glDeleteTransformFeedbacks(ids);
    }

    @Override
    public void glGenTransformFeedbacks(int[] ids) {
        GLES32.glGenTransformFeedbacks(ids);
    }

    @Override
    public void glGetQueryIndexediv(int target, int index, int pname, int[] params) {
        GLES32.glGetQueryIndexediv(target, index, pname, params);
    }

}