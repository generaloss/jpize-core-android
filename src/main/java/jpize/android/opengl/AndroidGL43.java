package jpize.android.opengl;

import android.opengl.GLES32;
import jpize.opengl.gl.GLI43;

import java.nio.*;

public class AndroidGL43 extends AndroidGL42 implements GLI43 {

    @Override
    public void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, ByteBuffer data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, ShortBuffer data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, IntBuffer data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, FloatBuffer data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        GLES32.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    @Override
    public void glDispatchComputeIndirect(long indirect) {
        GLES32.glDispatchComputeIndirect(indirect);
    }

    @Override
    public void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        GLES32.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    @Override
    public void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDebugMessageControl(int source, int type, int severity, IntBuffer ids, boolean enabled) {
        GLES32.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override
    public void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
        GLES32.glDebugMessageControl(source, type, severity, id, enabled);
    }

    @Override
    public void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDebugMessageInsert(int source, int type, int id, int severity, ByteBuffer message) {
        GLES32.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override
    public void glDebugMessageInsert(int source, int type, int id, int severity, CharSequence message) {
        GLES32.glDebugMessageInsert(source, type, id, severity, message);
    }

    @Override
    public void nglDebugMessageCallback(long callback, long userParam) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDebugMessageCallback(GLDebugMessageCallback callback, long userParam) {
        GLES32.glDebugMessageCallback(callback::invoke, userParam);
    }

    @Override
    public int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetDebugMessageLog(int count, IntBuffer sources, IntBuffer types, IntBuffer ids, IntBuffer severities, IntBuffer lengths, ByteBuffer messageLog) {
        return GLES32.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override
    public void nglPushDebugGroup(int source, int id, int length, long message) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPushDebugGroup(int source, int id, ByteBuffer message) {
        GLES32.glPushDebugGroup(source, id, message);
    }

    @Override
    public void glPushDebugGroup(int source, int id, CharSequence message) {
        GLES32.glPushDebugGroup(source, id, message);
    }

    @Override
    public void glPopDebugGroup() {
        GLES32.glPopDebugGroup();
    }

    @Override
    public void nglObjectLabel(int identifier, int name, int length, long label) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glObjectLabel(int identifier, int name, ByteBuffer label) {
        GLES32.glObjectLabel(identifier, name, label);
    }

    @Override
    public void glObjectLabel(int identifier, int name, CharSequence label) {
        GLES32.glObjectLabel(identifier, name, label);
    }

    @Override
    public void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetObjectLabel(int identifier, int name, IntBuffer length, ByteBuffer label) {
        GLES32.glGetObjectLabel(identifier, name, length, label);
    }

    @Override
    public String glGetObjectLabel(int identifier, int name, int bufSize) {
        return GLES32.glGetObjectLabel(identifier, name, bufSize);
    }

    @Override
    public String glGetObjectLabel(int identifier, int name) {
        return GLES32.glGetObjectLabel(identifier, name);
    }

    @Override
    public void nglObjectPtrLabel(long ptr, int length, long label) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glObjectPtrLabel(long ptr, ByteBuffer label) {
        GLES32.glObjectPtrLabel(ptr, label);
    }

    @Override
    public void glObjectPtrLabel(long ptr, CharSequence label) {
        GLES32.glObjectPtrLabel(ptr, label);
    }

    @Override
    public void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetObjectPtrLabel(long ptr, IntBuffer length, ByteBuffer label) {
        GLES32.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override
    public String glGetObjectPtrLabel(long ptr, int bufSize) {
        return GLES32.glGetObjectPtrLabel(ptr, bufSize);
    }

    @Override
    public String glGetObjectPtrLabel(long ptr) {
        return GLES32.glGetObjectPtrLabel(ptr);
    }

    @Override
    public void glFramebufferParameteri(int target, int pname, int param) {
        GLES32.glFramebufferParameteri(target, pname, param);
    }

    @Override
    public void nglGetFramebufferParameteriv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetFramebufferParameteriv(int target, int pname, IntBuffer params) {
        GLES32.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override
    public int glGetFramebufferParameteri(int target, int pname) {
        return GLES32.glGetFramebufferParameteri(target, pname);
    }

    @Override
    public void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetInternalformati64v(int target, int internalformat, int pname, LongBuffer params) {
        GLES32.glGetInternalformati64v(target, internalformat, pname, params);
    }

    @Override
    public long glGetInternalformati64(int target, int internalformat, int pname) {
        return GLES32.glGetInternalformati64(target, internalformat, pname);
    }

    @Override
    public void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        GLES32.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }

    @Override
    public void glInvalidateTexImage(int texture, int level) {
        GLES32.glInvalidateTexImage(texture, level);
    }

    @Override
    public void glInvalidateBufferSubData(int buffer, long offset, long length) {
        GLES32.glInvalidateBufferSubData(buffer, offset, length);
    }

    @Override
    public void glInvalidateBufferData(int buffer) {
        GLES32.glInvalidateBufferData(buffer);
    }

    @Override
    public void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInvalidateFramebuffer(int target, IntBuffer attachments) {
        GLES32.glInvalidateFramebuffer(target, attachments);
    }

    @Override
    public void glInvalidateFramebuffer(int target, int attachment) {
        GLES32.glInvalidateFramebuffer(target, attachment);
    }

    @Override
    public void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInvalidateSubFramebuffer(int target, IntBuffer attachments, int x, int y, int width, int height) {
        GLES32.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override
    public void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        GLES32.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    @Override
    public void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawArraysIndirect(int mode, ByteBuffer indirect, int drawcount, int stride) {
        GLES32.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override
    public void glMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        GLES32.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override
    public void glMultiDrawArraysIndirect(int mode, IntBuffer indirect, int drawcount, int stride) {
        GLES32.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override
    public void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultiDrawElementsIndirect(int mode, int type, ByteBuffer indirect, int drawcount, int stride) {
        GLES32.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override
    public void glMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        GLES32.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override
    public void glMultiDrawElementsIndirect(int mode, int type, IntBuffer indirect, int drawcount, int stride) {
        GLES32.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override
    public void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramInterfaceiv(int program, int programInterface, int pname, IntBuffer params) {
        GLES32.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override
    public int glGetProgramInterfacei(int program, int programInterface, int pname) {
        return GLES32.glGetProgramInterfacei(program, programInterface, pname);
    }

    @Override
    public int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetProgramResourceIndex(int program, int programInterface, ByteBuffer name) {
        return GLES32.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override
    public int glGetProgramResourceIndex(int program, int programInterface, CharSequence name) {
        return GLES32.glGetProgramResourceIndex(program, programInterface, name);
    }

    @Override
    public void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramResourceName(int program, int programInterface, int index, IntBuffer length, ByteBuffer name) {
        GLES32.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override
    public String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
        return GLES32.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    @Override
    public String glGetProgramResourceName(int program, int programInterface, int index) {
        return GLES32.glGetProgramResourceName(program, programInterface, index);
    }

    @Override
    public void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetProgramResourceiv(int program, int programInterface, int index, IntBuffer props, IntBuffer length, IntBuffer params) {
        GLES32.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    @Override
    public int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetProgramResourceLocation(int program, int programInterface, ByteBuffer name) {
        return GLES32.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override
    public int glGetProgramResourceLocation(int program, int programInterface, CharSequence name) {
        return GLES32.glGetProgramResourceLocation(program, programInterface, name);
    }

    @Override
    public int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetProgramResourceLocationIndex(int program, int programInterface, ByteBuffer name) {
        return GLES32.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    @Override
    public int glGetProgramResourceLocationIndex(int program, int programInterface, CharSequence name) {
        return GLES32.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    @Override
    public void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        GLES32.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
    }

    @Override
    public void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        GLES32.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    @Override
    public void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        GLES32.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    @Override
    public void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        GLES32.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    @Override
    public void glTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
        GLES32.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

    @Override
    public void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        GLES32.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    @Override
    public void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        GLES32.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    @Override
    public void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        GLES32.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    @Override
    public void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
        GLES32.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
    }

    @Override
    public void glVertexAttribBinding(int attribindex, int bindingindex) {
        GLES32.glVertexAttribBinding(attribindex, bindingindex);
    }

    @Override
    public void glVertexBindingDivisor(int bindingindex, int divisor) {
        GLES32.glVertexBindingDivisor(bindingindex, divisor);
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, short[] data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, int[] data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void glClearBufferData(int target, int internalformat, int format, int type, float[] data) {
        GLES32.glClearBufferData(target, internalformat, format, type, data);
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, short[] data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, int[] data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, float[] data) {
        GLES32.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    @Override
    public void glDebugMessageControl(int source, int type, int severity, int[] ids, boolean enabled) {
        GLES32.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    @Override
    public int glGetDebugMessageLog(int count, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, ByteBuffer messageLog) {
        return GLES32.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    @Override
    public void glGetObjectLabel(int identifier, int name, int[] length, ByteBuffer label) {
        GLES32.glGetObjectLabel(identifier, name, length, label);
    }

    @Override
    public void glGetObjectPtrLabel(long ptr, int[] length, ByteBuffer label) {
        GLES32.glGetObjectPtrLabel(ptr, length, label);
    }

    @Override
    public void glGetFramebufferParameteriv(int target, int pname, int[] params) {
        GLES32.glGetFramebufferParameteriv(target, pname, params);
    }

    @Override
    public void glGetInternalformati64v(int target, int internalformat, int pname, long[] params) {
        GLES32.glGetInternalformati64v(target, internalformat, pname, params);
    }

    @Override
    public void glInvalidateFramebuffer(int target, int[] attachments) {
        GLES32.glInvalidateFramebuffer(target, attachments);
    }

    @Override
    public void glInvalidateSubFramebuffer(int target, int[] attachments, int x, int y, int width, int height) {
        GLES32.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    @Override
    public void glMultiDrawArraysIndirect(int mode, int[] indirect, int drawcount, int stride) {
        GLES32.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    @Override
    public void glMultiDrawElementsIndirect(int mode, int type, int[] indirect, int drawcount, int stride) {
        GLES32.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    @Override
    public void glGetProgramInterfaceiv(int program, int programInterface, int pname, int[] params) {
        GLES32.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    @Override
    public void glGetProgramResourceName(int program, int programInterface, int index, int[] length, ByteBuffer name) {
        GLES32.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    @Override
    public void glGetProgramResourceiv(int program, int programInterface, int index, int[] props, int[] length, int[] params) {
        GLES32.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

}