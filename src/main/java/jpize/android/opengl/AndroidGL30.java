package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI30;
import java.nio.*;

public class AndroidGL30 extends AndroidGL21 implements GLI30 {

    @Override
    public long nglGetStringi(int name, int index) {
        return GLES32.nglGetStringi(name, index);
    }

    @Override
    public String glGetStringi(int name, int index) {
        return GLES32.glGetStringi(name, index);
    }

    @Override
    public void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        GLES32.nglClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, IntBuffer value) {
        GLES32.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        GLES32.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, IntBuffer value) {
        GLES32.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        GLES32.nglClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, FloatBuffer value) {
        GLES32.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        GLES32.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    @Override
    public void glVertexAttribI1i(int index, int x) {
        GLES32.glVertexAttribI1i(index, x);
    }

    @Override
    public void glVertexAttribI2i(int index, int x, int y) {
        GLES32.glVertexAttribI2i(index, x, y);
    }

    @Override
    public void glVertexAttribI3i(int index, int x, int y, int z) {
        GLES32.glVertexAttribI3i(index, x, y, z);
    }

    @Override
    public void glVertexAttribI4i(int index, int x, int y, int z, int w) {
        GLES32.glVertexAttribI4i(index, x, y, z, w);
    }

    @Override
    public void glVertexAttribI1ui(int index, int x) {
        GLES32.glVertexAttribI1ui(index, x);
    }

    @Override
    public void glVertexAttribI2ui(int index, int x, int y) {
        GLES32.glVertexAttribI2ui(index, x, y);
    }

    @Override
    public void glVertexAttribI3ui(int index, int x, int y, int z) {
        GLES32.glVertexAttribI3ui(index, x, y, z);
    }

    @Override
    public void glVertexAttribI4ui(int index, int x, int y, int z, int w) {
        GLES32.glVertexAttribI4ui(index, x, y, z, w);
    }

    @Override
    public void nglVertexAttribI1iv(int index, long v) {
        GLES32.nglVertexAttribI1iv(index, v);
    }

    @Override
    public void glVertexAttribI1iv(int index, IntBuffer v) {
        GLES32.glVertexAttribI1iv(index, v);
    }

    @Override
    public void nglVertexAttribI2iv(int index, long v) {
        GLES32.nglVertexAttribI2iv(index, v);
    }

    @Override
    public void glVertexAttribI2iv(int index, IntBuffer v) {
        GLES32.glVertexAttribI2iv(index, v);
    }

    @Override
    public void nglVertexAttribI3iv(int index, long v) {
        GLES32.nglVertexAttribI3iv(index, v);
    }

    @Override
    public void glVertexAttribI3iv(int index, IntBuffer v) {
        GLES32.glVertexAttribI3iv(index, v);
    }

    @Override
    public void nglVertexAttribI4iv(int index, long v) {
        GLES32.nglVertexAttribI4iv(index, v);
    }

    @Override
    public void glVertexAttribI4iv(int index, IntBuffer v) {
        GLES32.glVertexAttribI4iv(index, v);
    }

    @Override
    public void nglVertexAttribI1uiv(int index, long v) {
        GLES32.nglVertexAttribI1uiv(index, v);
    }

    @Override
    public void glVertexAttribI1uiv(int index, IntBuffer v) {
        GLES32.glVertexAttribI1uiv(index, v);
    }

    @Override
    public void nglVertexAttribI2uiv(int index, long v) {
        GLES32.nglVertexAttribI2uiv(index, v);
    }

    @Override
    public void glVertexAttribI2uiv(int index, IntBuffer v) {
        GLES32.glVertexAttribI2uiv(index, v);
    }

    @Override
    public void nglVertexAttribI3uiv(int index, long v) {
        GLES32.nglVertexAttribI3uiv(index, v);
    }

    @Override
    public void glVertexAttribI3uiv(int index, IntBuffer v) {
        GLES32.glVertexAttribI3uiv(index, v);
    }

    @Override
    public void nglVertexAttribI4uiv(int index, long v) {
        GLES32.nglVertexAttribI4uiv(index, v);
    }

    @Override
    public void glVertexAttribI4uiv(int index, IntBuffer v) {
        GLES32.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void nglVertexAttribI4bv(int index, long v) {
        GLES32.nglVertexAttribI4bv(index, v);
    }

    @Override
    public void glVertexAttribI4bv(int index, ByteBuffer v) {
        GLES32.glVertexAttribI4bv(index, v);
    }

    @Override
    public void nglVertexAttribI4sv(int index, long v) {
        GLES32.nglVertexAttribI4sv(index, v);
    }

    @Override
    public void glVertexAttribI4sv(int index, ShortBuffer v) {
        GLES32.glVertexAttribI4sv(index, v);
    }

    @Override
    public void nglVertexAttribI4ubv(int index, long v) {
        GLES32.nglVertexAttribI4ubv(index, v);
    }

    @Override
    public void glVertexAttribI4ubv(int index, ByteBuffer v) {
        GLES32.glVertexAttribI4ubv(index, v);
    }

    @Override
    public void nglVertexAttribI4usv(int index, long v) {
        GLES32.nglVertexAttribI4usv(index, v);
    }

    @Override
    public void glVertexAttribI4usv(int index, ShortBuffer v) {
        GLES32.glVertexAttribI4usv(index, v);
    }

    @Override
    public void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GLES32.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
        GLES32.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GLES32.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer pointer) {
        GLES32.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer pointer) {
        GLES32.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    @Override
    public void nglGetVertexAttribIiv(int index, int pname, long params) {
        GLES32.nglGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, IntBuffer params) {
        GLES32.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribIi(int index, int pname) {
        return GLES32.glGetVertexAttribIi(index, pname);
    }

    @Override
    public void nglGetVertexAttribIuiv(int index, int pname, long params) {
        GLES32.nglGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, IntBuffer params) {
        GLES32.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public int glGetVertexAttribIui(int index, int pname) {
        return GLES32.glGetVertexAttribIui(index, pname);
    }

    @Override
    public void glUniform1ui(int location, int v0) {
        GLES32.glUniform1ui(location, v0);
    }

    @Override
    public void glUniform2ui(int location, int v0, int v1) {
        GLES32.glUniform2ui(location, v0, v1);
    }

    @Override
    public void glUniform3ui(int location, int v0, int v1, int v2) {
        GLES32.glUniform3ui(location, v0, v1, v2);
    }

    @Override
    public void glUniform4ui(int location, int v0, int v1, int v2, int v3) {
        GLES32.glUniform4ui(location, v0, v1, v2, v3);
    }

    @Override
    public void nglUniform1uiv(int location, int count, long value) {
        GLES32.nglUniform1uiv(location, count, value);
    }

    @Override
    public void glUniform1uiv(int location, IntBuffer value) {
        GLES32.glUniform1uiv(location, value);
    }

    @Override
    public void nglUniform2uiv(int location, int count, long value) {
        GLES32.nglUniform2uiv(location, count, value);
    }

    @Override
    public void glUniform2uiv(int location, IntBuffer value) {
        GLES32.glUniform2uiv(location, value);
    }

    @Override
    public void nglUniform3uiv(int location, int count, long value) {
        GLES32.nglUniform3uiv(location, count, value);
    }

    @Override
    public void glUniform3uiv(int location, IntBuffer value) {
        GLES32.glUniform3uiv(location, value);
    }

    @Override
    public void nglUniform4uiv(int location, int count, long value) {
        GLES32.nglUniform4uiv(location, count, value);
    }

    @Override
    public void glUniform4uiv(int location, IntBuffer value) {
        GLES32.glUniform4uiv(location, value);
    }

    @Override
    public void nglGetUniformuiv(int program, int location, long params) {
        GLES32.nglGetUniformuiv(program, location, params);
    }

    @Override
    public void glGetUniformuiv(int program, int location, IntBuffer params) {
        GLES32.glGetUniformuiv(program, location, params);
    }

    @Override
    public int glGetUniformui(int program, int location) {
        return GLES32.glGetUniformui(program, location);
    }

    @Override
    public void nglBindFragDataLocation(int program, int colorNumber, long name) {
        GLES32.nglBindFragDataLocation(program, colorNumber, name);
    }

    @Override
    public void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name) {
        GLES32.glBindFragDataLocation(program, colorNumber, name);
    }

    @Override
    public void glBindFragDataLocation(int program, int colorNumber, CharSequence name) {
        GLES32.glBindFragDataLocation(program, colorNumber, name);
    }

    @Override
    public int nglGetFragDataLocation(int program, long name) {
        return GLES32.nglGetFragDataLocation(program, name);
    }

    @Override
    public int glGetFragDataLocation(int program, ByteBuffer name) {
        return GLES32.glGetFragDataLocation(program, name);
    }

    @Override
    public int glGetFragDataLocation(int program, CharSequence name) {
        return GLES32.glGetFragDataLocation(program, name);
    }

    @Override
    public void glBeginConditionalRender(int id, int mode) {
        GLES32.glBeginConditionalRender(id, mode);
    }

    @Override
    public void glEndConditionalRender() {
        GLES32.glEndConditionalRender();
    }

    @Override
    public long nglMapBufferRange(int target, long offset, long length, int access) {
        return GLES32.nglMapBufferRange(target, offset, length, access);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access) {
        return GLES32.glMapBufferRange(target, offset, length, access);
    }

    @Override
    public ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer) {
        return GLES32.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    @Override
    public void glFlushMappedBufferRange(int target, long offset, long length) {
        GLES32.glFlushMappedBufferRange(target, offset, length);
    }

    @Override
    public void glClampColor(int target, int clamp) {
        GLES32.glClampColor(target, clamp);
    }

    @Override
    public boolean glIsRenderbuffer(int renderbuffer) {
        return GLES32.glIsRenderbuffer(renderbuffer);
    }

    @Override
    public void glBindRenderbuffer(int target, int renderbuffer) {
        GLES32.glBindRenderbuffer(target, renderbuffer);
    }

    @Override
    public void nglDeleteRenderbuffers(int n, long renderbuffers) {
        GLES32.nglDeleteRenderbuffers(n, renderbuffers);
    }

    @Override
    public void glDeleteRenderbuffers(IntBuffer renderbuffers) {
        GLES32.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glDeleteRenderbuffers(int renderbuffer) {
        GLES32.glDeleteRenderbuffers(renderbuffer);
    }

    @Override
    public void nglGenRenderbuffers(int n, long renderbuffers) {
        GLES32.nglGenRenderbuffers(n, renderbuffers);
    }

    @Override
    public void glGenRenderbuffers(IntBuffer renderbuffers) {
        GLES32.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public int glGenRenderbuffers() {
        return GLES32.glGenRenderbuffers();
    }

    @Override
    public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        GLES32.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Override
    public void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        GLES32.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    @Override
    public void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        GLES32.nglGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
        GLES32.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public int glGetRenderbufferParameteri(int target, int pname) {
        return GLES32.glGetRenderbufferParameteri(target, pname);
    }

    @Override
    public boolean glIsFramebuffer(int framebuffer) {
        return GLES32.glIsFramebuffer(framebuffer);
    }

    @Override
    public void glBindFramebuffer(int target, int framebuffer) {
        GLES32.glBindFramebuffer(target, framebuffer);
    }

    @Override
    public void nglDeleteFramebuffers(int n, long framebuffers) {
        GLES32.nglDeleteFramebuffers(n, framebuffers);
    }

    @Override
    public void glDeleteFramebuffers(IntBuffer framebuffers) {
        GLES32.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glDeleteFramebuffers(int framebuffer) {
        GLES32.glDeleteFramebuffers(framebuffer);
    }

    @Override
    public void nglGenFramebuffers(int n, long framebuffers) {
        GLES32.nglGenFramebuffers(n, framebuffers);
    }

    @Override
    public void glGenFramebuffers(IntBuffer framebuffers) {
        GLES32.glGenFramebuffers(framebuffers);
    }

    @Override
    public int glGenFramebuffers() {
        return GLES32.glGenFramebuffers();
    }

    @Override
    public int glCheckFramebufferStatus(int target) {
        return GLES32.glCheckFramebufferStatus(target);
    }

    @Override
    public void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
        GLES32.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    @Override
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        GLES32.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Override
    public void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int layer) {
        GLES32.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    @Override
    public void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        GLES32.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    @Override
    public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        GLES32.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Override
    public void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        GLES32.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
        GLES32.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        return GLES32.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    @Override
    public void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        GLES32.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    @Override
    public void glGenerateMipmap(int target) {
        GLES32.glGenerateMipmap(target);
    }

    @Override
    public void nglTexParameterIiv(int target, int pname, long params) {
        GLES32.nglTexParameterIiv(target, pname, params);
    }

    @Override
    public void glTexParameterIiv(int target, int pname, IntBuffer params) {
        GLES32.glTexParameterIiv(target, pname, params);
    }

    @Override
    public void glTexParameterIi(int target, int pname, int param) {
        GLES32.glTexParameterIi(target, pname, param);
    }

    @Override
    public void nglTexParameterIuiv(int target, int pname, long params) {
        GLES32.nglTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glTexParameterIuiv(int target, int pname, IntBuffer params) {
        GLES32.glTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glTexParameterIui(int target, int pname, int param) {
        GLES32.glTexParameterIui(target, pname, param);
    }

    @Override
    public void nglGetTexParameterIiv(int target, int pname, long params) {
        GLES32.nglGetTexParameterIiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIiv(int target, int pname, IntBuffer params) {
        GLES32.glGetTexParameterIiv(target, pname, params);
    }

    @Override
    public int glGetTexParameterIi(int target, int pname) {
        return GLES32.glGetTexParameterIi(target, pname);
    }

    @Override
    public void nglGetTexParameterIuiv(int target, int pname, long params) {
        GLES32.nglGetTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIuiv(int target, int pname, IntBuffer params) {
        GLES32.glGetTexParameterIuiv(target, pname, params);
    }

    @Override
    public int glGetTexParameterIui(int target, int pname) {
        return GLES32.glGetTexParameterIui(target, pname);
    }

    @Override
    public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a) {
        GLES32.glColorMaski(buf, r, g, b, a);
    }

    @Override
    public void nglGetBooleani_v(int target, int index, long data) {
        GLES32.nglGetBooleani_v(target, index, data);
    }

    @Override
    public void glGetBooleani_v(int target, int index, ByteBuffer data) {
        GLES32.glGetBooleani_v(target, index, data);
    }

    @Override
    public boolean glGetBooleani(int target, int index) {
        return GLES32.glGetBooleani(target, index);
    }

    @Override
    public void nglGetIntegeri_v(int target, int index, long data) {
        GLES32.nglGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, IntBuffer data) {
        GLES32.glGetIntegeri_v(target, index, data);
    }

    @Override
    public int glGetIntegeri(int target, int index) {
        return GLES32.glGetIntegeri(target, index);
    }

    @Override
    public void glEnablei(int cap, int index) {
        GLES32.glEnablei(cap, index);
    }

    @Override
    public void glDisablei(int target, int index) {
        GLES32.glDisablei(target, index);
    }

    @Override
    public boolean glIsEnabledi(int target, int index) {
        return GLES32.glIsEnabledi(target, index);
    }

    @Override
    public void glBindBufferRange(int target, int index, int buffer, long offset, long size) {
        GLES32.glBindBufferRange(target, index, buffer, offset, size);
    }

    @Override
    public void glBindBufferBase(int target, int index, int buffer) {
        GLES32.glBindBufferBase(target, index, buffer);
    }

    @Override
    public void glBeginTransformFeedback(int primitiveMode) {
        GLES32.glBeginTransformFeedback(primitiveMode);
    }

    @Override
    public void glEndTransformFeedback() {
        GLES32.glEndTransformFeedback();
    }

    @Override
    public void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        GLES32.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode) {
        GLES32.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    @Override
    public void glTransformFeedbackVaryings(int program, CharSequence varying, int bufferMode) {
        GLES32.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    @Override
    public void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        GLES32.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        GLES32.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
        return GLES32.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    @Override
    public String glGetTransformFeedbackVarying(int program, int index, IntBuffer size, IntBuffer type) {
        return GLES32.glGetTransformFeedbackVarying(program, index, size, type);
    }

    @Override
    public void glBindVertexArray(int array) {
        GLES32.glBindVertexArray(array);
    }

    @Override
    public void nglDeleteVertexArrays(int n, long arrays) {
        GLES32.nglDeleteVertexArrays(n, arrays);
    }

    @Override
    public void glDeleteVertexArrays(IntBuffer arrays) {
        GLES32.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glDeleteVertexArrays(int array) {
        GLES32.glDeleteVertexArrays(array);
    }

    @Override
    public void nglGenVertexArrays(int n, long arrays) {
        GLES32.nglGenVertexArrays(n, arrays);
    }

    @Override
    public void glGenVertexArrays(IntBuffer arrays) {
        GLES32.glGenVertexArrays(arrays);
    }

    @Override
    public int glGenVertexArrays() {
        return GLES32.glGenVertexArrays();
    }

    @Override
    public boolean glIsVertexArray(int array) {
        return GLES32.glIsVertexArray(array);
    }

    @Override
    public void glClearBufferiv(int buffer, int drawbuffer, int[] value) {
        GLES32.glClearBufferiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferuiv(int buffer, int drawbuffer, int[] value) {
        GLES32.glClearBufferuiv(buffer, drawbuffer, value);
    }

    @Override
    public void glClearBufferfv(int buffer, int drawbuffer, float[] value) {
        GLES32.glClearBufferfv(buffer, drawbuffer, value);
    }

    @Override
    public void glVertexAttribI1iv(int index, int[] v) {
        GLES32.glVertexAttribI1iv(index, v);
    }

    @Override
    public void glVertexAttribI2iv(int index, int[] v) {
        GLES32.glVertexAttribI2iv(index, v);
    }

    @Override
    public void glVertexAttribI3iv(int index, int[] v) {
        GLES32.glVertexAttribI3iv(index, v);
    }

    @Override
    public void glVertexAttribI4iv(int index, int[] v) {
        GLES32.glVertexAttribI4iv(index, v);
    }

    @Override
    public void glVertexAttribI1uiv(int index, int[] v) {
        GLES32.glVertexAttribI1uiv(index, v);
    }

    @Override
    public void glVertexAttribI2uiv(int index, int[] v) {
        GLES32.glVertexAttribI2uiv(index, v);
    }

    @Override
    public void glVertexAttribI3uiv(int index, int[] v) {
        GLES32.glVertexAttribI3uiv(index, v);
    }

    @Override
    public void glVertexAttribI4uiv(int index, int[] v) {
        GLES32.glVertexAttribI4uiv(index, v);
    }

    @Override
    public void glVertexAttribI4sv(int index, short[] v) {
        GLES32.glVertexAttribI4sv(index, v);
    }

    @Override
    public void glVertexAttribI4usv(int index, short[] v) {
        GLES32.glVertexAttribI4usv(index, v);
    }

    @Override
    public void glGetVertexAttribIiv(int index, int pname, int[] params) {
        GLES32.glGetVertexAttribIiv(index, pname, params);
    }

    @Override
    public void glGetVertexAttribIuiv(int index, int pname, int[] params) {
        GLES32.glGetVertexAttribIuiv(index, pname, params);
    }

    @Override
    public void glUniform1uiv(int location, int[] value) {
        GLES32.glUniform1uiv(location, value);
    }

    @Override
    public void glUniform2uiv(int location, int[] value) {
        GLES32.glUniform2uiv(location, value);
    }

    @Override
    public void glUniform3uiv(int location, int[] value) {
        GLES32.glUniform3uiv(location, value);
    }

    @Override
    public void glUniform4uiv(int location, int[] value) {
        GLES32.glUniform4uiv(location, value);
    }

    @Override
    public void glGetUniformuiv(int program, int location, int[] params) {
        GLES32.glGetUniformuiv(program, location, params);
    }

    @Override
    public void glDeleteRenderbuffers(int[] renderbuffers) {
        GLES32.glDeleteRenderbuffers(renderbuffers);
    }

    @Override
    public void glGenRenderbuffers(int[] renderbuffers) {
        GLES32.glGenRenderbuffers(renderbuffers);
    }

    @Override
    public void glGetRenderbufferParameteriv(int target, int pname, int[] params) {
        GLES32.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Override
    public void glDeleteFramebuffers(int[] framebuffers) {
        GLES32.glDeleteFramebuffers(framebuffers);
    }

    @Override
    public void glGenFramebuffers(int[] framebuffers) {
        GLES32.glGenFramebuffers(framebuffers);
    }

    @Override
    public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        GLES32.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Override
    public void glTexParameterIiv(int target, int pname, int[] params) {
        GLES32.glTexParameterIiv(target, pname, params);
    }

    @Override
    public void glTexParameterIuiv(int target, int pname, int[] params) {
        GLES32.glTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIiv(int target, int pname, int[] params) {
        GLES32.glGetTexParameterIiv(target, pname, params);
    }

    @Override
    public void glGetTexParameterIuiv(int target, int pname, int[] params) {
        GLES32.glGetTexParameterIuiv(target, pname, params);
    }

    @Override
    public void glGetIntegeri_v(int target, int index, int[] data) {
        GLES32.glGetIntegeri_v(target, index, data);
    }

    @Override
    public void glGetTransformFeedbackVarying(int program, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
        GLES32.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    @Override
    public void glDeleteVertexArrays(int[] arrays) {
        GLES32.glDeleteVertexArrays(arrays);
    }

    @Override
    public void glGenVertexArrays(int[] arrays) {
        GLES32.glGenVertexArrays(arrays);
    }

}