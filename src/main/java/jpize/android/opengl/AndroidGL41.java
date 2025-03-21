package jpize.android.opengl;

import android.opengl.GLES32;
import jpize.opengl.gl.GLI41;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class AndroidGL41 extends AndroidGL40 implements GLI41 {

    @Override
    public void glReleaseShaderCompiler() {
        GLES32.glReleaseShaderCompiler();
    }

    @Override
    public void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary) {
        GLES32.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override
    public void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision) {
        GLES32.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override
    public int glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range) {
        return GLES32.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
    }

    @Override
    public void glDepthRangef(float zNear, float zFar) {
        GLES32.glDepthRangef(zNear, zFar);
    }

    @Override
    public void glClearDepthf(float depth) {
        GLES32.glClearDepthf(depth);
    }

    @Override
    public void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
        GLES32.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override
    public void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
        GLES32.glProgramBinary(program, binaryFormat, binary);
    }

    @Override
    public void glProgramParameteri(int program, int pname, int value) {
        GLES32.glProgramParameteri(program, pname, value);
    }

    @Override
    public void glUseProgramStages(int pipeline, int stages, int program) {
        GLES32.glUseProgramStages(pipeline, stages, program);
    }

    @Override
    public void glActiveShaderProgram(int pipeline, int program) {
        GLES32.glActiveShaderProgram(pipeline, program);
    }

    @Override
    public int nglCreateShaderProgramv(int type, int count, long strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glCreateShaderProgramv(int type, CharSequence... strings) {
        return GLES32.glCreateShaderProgramv(type, strings);
    }

    @Override
    public int glCreateShaderProgramv(int type, CharSequence string) {
        return GLES32.glCreateShaderProgramv(type, string);
    }

    @Override
    public void glBindProgramPipeline(int pipeline) {
        GLES32.glBindProgramPipeline(pipeline);
    }

    @Override
    public void nglDeleteProgramPipelines(int n, long pipelines) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteProgramPipelines(IntBuffer pipelines) {
        GLES32.glDeleteProgramPipelines(pipelines);
    }

    @Override
    public void glDeleteProgramPipelines(int pipeline) {
        GLES32.glDeleteProgramPipelines(pipeline);
    }

    @Override
    public void nglGenProgramPipelines(int n, long pipelines) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenProgramPipelines(IntBuffer pipelines) {
        GLES32.glGenProgramPipelines(pipelines);
    }

    @Override
    public int glGenProgramPipelines() {
        return GLES32.glGenProgramPipelines();
    }

    @Override
    public boolean glIsProgramPipeline(int pipeline) {
        return GLES32.glIsProgramPipeline(pipeline);
    }

    @Override
    public void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramPipelineiv(int pipeline, int pname, IntBuffer params) {
        GLES32.glGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override
    public int glGetProgramPipelinei(int pipeline, int pname) {
        return GLES32.glGetProgramPipelinei(pipeline, pname);
    }

    @Override
    public void glProgramUniform1i(int program, int location, int x) {
        GLES32.glProgramUniform1i(program, location, x);
    }

    @Override
    public void glProgramUniform2i(int program, int location, int x, int y) {
        GLES32.glProgramUniform2i(program, location, x, y);
    }

    @Override
    public void glProgramUniform3i(int program, int location, int x, int y, int z) {
        GLES32.glProgramUniform3i(program, location, x, y, z);
    }

    @Override
    public void glProgramUniform4i(int program, int location, int x, int y, int z, int w) {
        GLES32.glProgramUniform4i(program, location, x, y, z, w);
    }

    @Override
    public void glProgramUniform1ui(int program, int location, int x) {
        GLES32.glProgramUniform1ui(program, location, x);
    }

    @Override
    public void glProgramUniform2ui(int program, int location, int x, int y) {
        GLES32.glProgramUniform2ui(program, location, x, y);
    }

    @Override
    public void glProgramUniform3ui(int program, int location, int x, int y, int z) {
        GLES32.glProgramUniform3ui(program, location, x, y, z);
    }

    @Override
    public void glProgramUniform4ui(int program, int location, int x, int y, int z, int w) {
        GLES32.glProgramUniform4ui(program, location, x, y, z, w);
    }

    @Override
    public void glProgramUniform1f(int program, int location, float x) {
        GLES32.glProgramUniform1f(program, location, x);
    }

    @Override
    public void glProgramUniform2f(int program, int location, float x, float y) {
        GLES32.glProgramUniform2f(program, location, x, y);
    }

    @Override
    public void glProgramUniform3f(int program, int location, float x, float y, float z) {
        GLES32.glProgramUniform3f(program, location, x, y, z);
    }

    @Override
    public void glProgramUniform4f(int program, int location, float x, float y, float z, float w) {
        GLES32.glProgramUniform4f(program, location, x, y, z, w);
    }

    @Override
    public void glProgramUniform1d(int program, int location, double x) {
        GLES32.glProgramUniform1d(program, location, x);
    }

    @Override
    public void glProgramUniform2d(int program, int location, double x, double y) {
        GLES32.glProgramUniform2d(program, location, x, y);
    }

    @Override
    public void glProgramUniform3d(int program, int location, double x, double y, double z) {
        GLES32.glProgramUniform3d(program, location, x, y, z);
    }

    @Override
    public void glProgramUniform4d(int program, int location, double x, double y, double z, double w) {
        GLES32.glProgramUniform4d(program, location, x, y, z, w);
    }

    @Override
    public void nglProgramUniform1iv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform1iv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform1iv(program, location, value);
    }

    @Override
    public void nglProgramUniform2iv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform2iv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform2iv(program, location, value);
    }

    @Override
    public void nglProgramUniform3iv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform3iv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform3iv(program, location, value);
    }

    @Override
    public void nglProgramUniform4iv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform4iv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform4iv(program, location, value);
    }

    @Override
    public void nglProgramUniform1uiv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform1uiv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform1uiv(program, location, value);
    }

    @Override
    public void nglProgramUniform2uiv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform2uiv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform2uiv(program, location, value);
    }

    @Override
    public void nglProgramUniform3uiv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform3uiv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform3uiv(program, location, value);
    }

    @Override
    public void nglProgramUniform4uiv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform4uiv(int program, int location, IntBuffer value) {
        GLES32.glProgramUniform4uiv(program, location, value);
    }

    @Override
    public void nglProgramUniform1fv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform1fv(int program, int location, FloatBuffer value) {
        GLES32.glProgramUniform1fv(program, location, value);
    }

    @Override
    public void nglProgramUniform2fv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform2fv(int program, int location, FloatBuffer value) {
        GLES32.glProgramUniform2fv(program, location, value);
    }

    @Override
    public void nglProgramUniform3fv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform3fv(int program, int location, FloatBuffer value) {
        GLES32.glProgramUniform3fv(program, location, value);
    }

    @Override
    public void nglProgramUniform4fv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform4fv(int program, int location, FloatBuffer value) {
        GLES32.glProgramUniform4fv(program, location, value);
    }

    @Override
    public void nglProgramUniform1dv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform1dv(int program, int location, DoubleBuffer value) {
        GLES32.glProgramUniform1dv(program, location, value);
    }

    @Override
    public void nglProgramUniform2dv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform2dv(int program, int location, DoubleBuffer value) {
        GLES32.glProgramUniform2dv(program, location, value);
    }

    @Override
    public void nglProgramUniform3dv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform3dv(int program, int location, DoubleBuffer value) {
        GLES32.glProgramUniform3dv(program, location, value);
    }

    @Override
    public void nglProgramUniform4dv(int program, int location, int count, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniform4dv(int program, int location, DoubleBuffer value) {
        GLES32.glProgramUniform4dv(program, location, value);
    }

    @Override
    public void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix2fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix3fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix4fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix2dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix3dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix4dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, FloatBuffer value) {
        GLES32.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    @Override
    public void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, DoubleBuffer value) {
        GLES32.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    @Override
    public void glValidateProgramPipeline(int pipeline) {
        GLES32.glValidateProgramPipeline(pipeline);
    }

    @Override
    public void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramPipelineInfoLog(int pipeline, IntBuffer length, ByteBuffer infoLog) {
        GLES32.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    @Override
    public String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
        return GLES32.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

    @Override
    public String glGetProgramPipelineInfoLog(int pipeline) {
        return GLES32.glGetProgramPipelineInfoLog(pipeline);
    }

    @Override
    public void glVertexAttribL1d(int index, double x) {
        GLES32.glVertexAttribL1d(index, x);
    }

    @Override
    public void glVertexAttribL2d(int index, double x, double y) {
        GLES32.glVertexAttribL2d(index, x, y);
    }

    @Override
    public void glVertexAttribL3d(int index, double x, double y, double z) {
        GLES32.glVertexAttribL3d(index, x, y, z);
    }

    @Override
    public void glVertexAttribL4d(int index, double x, double y, double z, double w) {
        GLES32.glVertexAttribL4d(index, x, y, z, w);
    }

    @Override
    public void nglVertexAttribL1dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribL1dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttribL1dv(index, v);
    }

    @Override
    public void nglVertexAttribL2dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribL2dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttribL2dv(index, v);
    }

    @Override
    public void nglVertexAttribL3dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribL3dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttribL3dv(index, v);
    }

    @Override
    public void nglVertexAttribL4dv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribL4dv(int index, DoubleBuffer v) {
        GLES32.glVertexAttribL4dv(index, v);
    }

    @Override
    public void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexAttribLPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        GLES32.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        GLES32.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribLPointer(int index, int size, int stride, DoubleBuffer pointer) {
        GLES32.glVertexAttribLPointer(index, size, stride, pointer);
    }

    @Override
    public void nglGetVertexAttribLdv(int index, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetVertexAttribLdv(int index, int pname, DoubleBuffer params) {
        GLES32.glGetVertexAttribLdv(index, pname, params);
    }

    @Override
    public void nglViewportArrayv(int first, int count, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glViewportArrayv(int first, FloatBuffer v) {
        GLES32.glViewportArrayv(first, v);
    }

    @Override
    public void glViewportIndexedf(int index, float x, float y, float w, float h) {
        GLES32.glViewportIndexedf(index, x, y, w, h);
    }

    @Override
    public void nglViewportIndexedfv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glViewportIndexedfv(int index, FloatBuffer v) {
        GLES32.glViewportIndexedfv(index, v);
    }

    @Override
    public void nglScissorArrayv(int first, int count, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glScissorArrayv(int first, IntBuffer v) {
        GLES32.glScissorArrayv(first, v);
    }

    @Override
    public void glScissorIndexed(int index, int left, int bottom, int width, int height) {
        GLES32.glScissorIndexed(index, left, bottom, width, height);
    }

    @Override
    public void nglScissorIndexedv(int index, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glScissorIndexedv(int index, IntBuffer v) {
        GLES32.glScissorIndexedv(index, v);
    }

    @Override
    public void nglDepthRangeArrayv(int first, int count, long v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDepthRangeArrayv(int first, DoubleBuffer v) {
        GLES32.glDepthRangeArrayv(first, v);
    }

    @Override
    public void glDepthRangeIndexed(int index, double zNear, double zFar) {
        GLES32.glDepthRangeIndexed(index, zNear, zFar);
    }

    @Override
    public void nglGetFloati_v(int target, int index, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetFloati_v(int target, int index, FloatBuffer data) {
        GLES32.glGetFloati_v(target, index, data);
    }

    @Override
    public float glGetFloati(int target, int index) {
        return GLES32.glGetFloati(target, index);
    }

    @Override
    public void nglGetDoublei_v(int target, int index, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetDoublei_v(int target, int index, DoubleBuffer data) {
        GLES32.glGetDoublei_v(target, index, data);
    }

    @Override
    public double glGetDoublei(int target, int index) {
        return GLES32.glGetDoublei(target, index);
    }

    @Override
    public void glShaderBinary(int[] shaders, int binaryformat, ByteBuffer binary) {
        GLES32.glShaderBinary(shaders, binaryformat, binary);
    }

    @Override
    public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, int[] range, int[] precision) {
        GLES32.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    @Override
    public void glGetProgramBinary(int program, int[] length, int[] binaryFormat, ByteBuffer binary) {
        GLES32.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    @Override
    public void glDeleteProgramPipelines(int[] pipelines) {
        GLES32.glDeleteProgramPipelines(pipelines);
    }

    @Override
    public void glGenProgramPipelines(int[] pipelines) {
        GLES32.glGenProgramPipelines(pipelines);
    }

    @Override
    public void glGetProgramPipelineiv(int pipeline, int pname, int[] params) {
        GLES32.glGetProgramPipelineiv(pipeline, pname, params);
    }

    @Override
    public void glProgramUniform1iv(int program, int location, int[] value) {
        GLES32.glProgramUniform1iv(program, location, value);
    }

    @Override
    public void glProgramUniform2iv(int program, int location, int[] value) {
        GLES32.glProgramUniform2iv(program, location, value);
    }

    @Override
    public void glProgramUniform3iv(int program, int location, int[] value) {
        GLES32.glProgramUniform3iv(program, location, value);
    }

    @Override
    public void glProgramUniform4iv(int program, int location, int[] value) {
        GLES32.glProgramUniform4iv(program, location, value);
    }

    @Override
    public void glProgramUniform1uiv(int program, int location, int[] value) {
        GLES32.glProgramUniform1uiv(program, location, value);
    }

    @Override
    public void glProgramUniform2uiv(int program, int location, int[] value) {
        GLES32.glProgramUniform2uiv(program, location, value);
    }

    @Override
    public void glProgramUniform3uiv(int program, int location, int[] value) {
        GLES32.glProgramUniform3uiv(program, location, value);
    }

    @Override
    public void glProgramUniform4uiv(int program, int location, int[] value) {
        GLES32.glProgramUniform4uiv(program, location, value);
    }

    @Override
    public void glProgramUniform1fv(int program, int location, float[] value) {
        GLES32.glProgramUniform1fv(program, location, value);
    }

    @Override
    public void glProgramUniform2fv(int program, int location, float[] value) {
        GLES32.glProgramUniform2fv(program, location, value);
    }

    @Override
    public void glProgramUniform3fv(int program, int location, float[] value) {
        GLES32.glProgramUniform3fv(program, location, value);
    }

    @Override
    public void glProgramUniform4fv(int program, int location, float[] value) {
        GLES32.glProgramUniform4fv(program, location, value);
    }

    @Override
    public void glProgramUniform1dv(int program, int location, double[] value) {
        GLES32.glProgramUniform1dv(program, location, value);
    }

    @Override
    public void glProgramUniform2dv(int program, int location, double[] value) {
        GLES32.glProgramUniform2dv(program, location, value);
    }

    @Override
    public void glProgramUniform3dv(int program, int location, double[] value) {
        GLES32.glProgramUniform3dv(program, location, value);
    }

    @Override
    public void glProgramUniform4dv(int program, int location, double[] value) {
        GLES32.glProgramUniform4dv(program, location, value);
    }

    @Override
    public void glProgramUniformMatrix2fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix3fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix4fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix2dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix3dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix4dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix2x3fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix3x2fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix2x4fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix4x2fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix3x4fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix4x3fv(int program, int location, boolean transpose, float[] value) {
        GLES32.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix2x3dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix3x2dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix2x4dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix4x2dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix3x4dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    @Override
    public void glProgramUniformMatrix4x3dv(int program, int location, boolean transpose, double[] value) {
        GLES32.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    @Override
    public void glGetProgramPipelineInfoLog(int pipeline, int[] length, ByteBuffer infoLog) {
        GLES32.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    @Override
    public void glVertexAttribL1dv(int index, double[] v) {
        GLES32.glVertexAttribL1dv(index, v);
    }

    @Override
    public void glVertexAttribL2dv(int index, double[] v) {
        GLES32.glVertexAttribL2dv(index, v);
    }

    @Override
    public void glVertexAttribL3dv(int index, double[] v) {
        GLES32.glVertexAttribL3dv(index, v);
    }

    @Override
    public void glVertexAttribL4dv(int index, double[] v) {
        GLES32.glVertexAttribL4dv(index, v);
    }

    @Override
    public void glGetVertexAttribLdv(int index, int pname, double[] params) {
        GLES32.glGetVertexAttribLdv(index, pname, params);
    }

    @Override
    public void glViewportArrayv(int first, float[] v) {
        GLES32.glViewportArrayv(first, v);
    }

    @Override
    public void glViewportIndexedfv(int index, float[] v) {
        GLES32.glViewportIndexedfv(index, v);
    }

    @Override
    public void glScissorArrayv(int first, int[] v) {
        GLES32.glScissorArrayv(first, v);
    }

    @Override
    public void glScissorIndexedv(int index, int[] v) {
        GLES32.glScissorIndexedv(index, v);
    }

    @Override
    public void glDepthRangeArrayv(int first, double[] v) {
        GLES32.glDepthRangeArrayv(first, v);
    }

    @Override
    public void glGetFloati_v(int target, int index, float[] data) {
        GLES32.glGetFloati_v(target, index, data);
    }

    @Override
    public void glGetDoublei_v(int target, int index, double[] data) {
        GLES32.glGetDoublei_v(target, index, data);
    }

}