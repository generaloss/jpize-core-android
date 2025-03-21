package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI11;
import jpize.opengl.type.GlType;

import java.nio.*;
import java.nio.charset.Charset;

public class AndroidGL11 implements GLI11 {

    // '(return )?GLES32\..*' => 'throw new UnsupportedOperationException();'

    protected static final int[] tmp_int = new int[1];
    protected static final int[] tmp_int_arg = new int[1];
    protected static final long[] tmp_long = new long[1];
    protected static final float[] tmp_float = new float[1];

    protected static ShortBuffer createShortBuffer(int size) {
        return ByteBuffer.allocateDirect(size * Short.BYTES)
            .order(ByteOrder.nativeOrder())
            .asShortBuffer();
    }

    protected static IntBuffer createIntBuffer(int size) {
        return ByteBuffer.allocateDirect(size * Integer.BYTES)
            .order(ByteOrder.nativeOrder())
            .asIntBuffer();
    }

    protected static FloatBuffer createFloatBuffer(int size) {
        return ByteBuffer.allocateDirect(size * Float.BYTES)
            .order(ByteOrder.nativeOrder())
            .asFloatBuffer();
    }

    protected static int bufferCount(Buffer buffer, int type) {
        return (buffer.limit() / GlType.byValue(type).size);
    }


    protected static ShortBuffer createBuffer(short[] array) {
        if(array == null)
            return null;
        final ShortBuffer buffer = ByteBuffer.allocateDirect(array.length * Short.BYTES)
            .order(ByteOrder.nativeOrder())
            .asShortBuffer()
            .put(array);
        buffer.position(0);
        return buffer;
    }

    protected static IntBuffer createBuffer(int[] array) {
        if(array == null)
            return null;
        final IntBuffer buffer = ByteBuffer.allocateDirect(array.length * Integer.BYTES)
            .order(ByteOrder.nativeOrder())
            .asIntBuffer()
            .put(array);
        buffer.position(0);
        return buffer;
    }

    protected static LongBuffer createBuffer(long[] array) {
        if(array == null)
            return null;
        final LongBuffer buffer = ByteBuffer.allocateDirect(array.length * Long.BYTES)
            .order(ByteOrder.nativeOrder())
            .asLongBuffer()
            .put(array);
        buffer.position(0);
        return buffer;
    }

    protected static FloatBuffer createBuffer(float[] array) {
        if(array == null)
            return null;
        final FloatBuffer buffer = ByteBuffer.allocateDirect(array.length * Float.BYTES)
            .order(ByteOrder.nativeOrder())
            .asFloatBuffer()
            .put(array);
        buffer.position(0);
        return buffer;
    }

    protected static DoubleBuffer createBuffer(double[] array) {
        if(array == null)
            return null;
        final DoubleBuffer buffer = ByteBuffer.allocateDirect(array.length * Double.BYTES)
            .order(ByteOrder.nativeOrder())
            .asDoubleBuffer()
            .put(array);
        buffer.position(0);
        return buffer;
    }

    protected static byte[] createArray(ByteBuffer buffer) {
        if(buffer == null)
            return null;
        final byte[] array = new byte[buffer.limit()];
        buffer.get(array);
        buffer.position(0);
        return array;
    }

    protected static int[] createArray(IntBuffer buffer) {
        if(buffer == null)
            return null;
        final int[] array = new int[buffer.limit()];
        buffer.get(array);
        buffer.position(0);
        return array;
    }

    protected String createString(ByteBuffer buffer) {
        if(buffer == null)
            return null;
        return Charset.defaultCharset().decode(buffer).toString();
    }

    protected String createString(byte[] buffer) {
        if(buffer == null)
            return null;
        return new String(buffer);
    }

    protected void setBufferString(String string, int maxLength, ByteBuffer buffer) {
        if(string.length() > maxLength)
            string = string.substring(0, maxLength);
        buffer.put(string.getBytes());
        buffer.position(0);
    }

    protected String[] createStringArray(CharSequence... charSequences) {
        if(charSequences == null)
            return null;
        final String[] array = new String[charSequences.length];
        for(int i = 0; i < array.length; i++)
            array[i] = charSequences[i].toString();
        return array;
    }


    @Override
    public void glEnable(int target) {
        GLES10.glEnable(target);
    }

    @Override
    public void glDisable(int target) {
        GLES10.glDisable(target);
    }

    @Override
    public void glAccum(int var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glAlphaFunc(int var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean nglAreTexturesResident(int var0, long var1, long var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean glAreTexturesResident(int texture, ByteBuffer residences) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glArrayElement(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBegin(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBindTexture(int target, int texture) {
        GLES10.glBindTexture(target, texture);
    }

    @Override
    public void nglBitmap(int var0, int var1, float var2, float var3, float var4, float var5, long var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, ByteBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glBlendFunc(int sfactor, int dfactor) {
        GLES10.glBlendFunc(sfactor, dfactor);
    }

    @Override
    public void glCallList(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglCallLists(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCallLists(int type, ByteBuffer lists) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCallLists(ByteBuffer lists) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCallLists(ShortBuffer lists) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCallLists(IntBuffer lists) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClear(int mask) {
        GLES10.glClear(mask);
    }

    @Override
    public void glClearAccum(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClearColor(float red, float green, float blue, float alpha) {
        GLES10.glClearColor(red, green, blue, alpha);
    }

    @Override
    public void glClearDepth(double depth) {
        GLES20.glClearDepthf((float) depth);
    }

    @Override
    public void glClearIndex(float var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClearStencil(int s) {
        GLES10.glClearStencil(s);
    }

    @Override
    public void nglClipPlane(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClipPlane(int plane, DoubleBuffer equation) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3b(byte var0, byte var1, byte var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3s(short var0, short var1, short var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3i(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3f(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3d(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3ub(byte var0, byte var1, byte var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3us(short var0, short var1, short var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3ui(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3bv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3bv(ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3ubv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3ubv(ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3usv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3usv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor3uiv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3uiv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4b(byte var0, byte var1, byte var2, byte var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4s(short var0, short var1, short var2, short var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4i(int var0, int var1, int var2, int var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4f(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4d(double var0, double var2, double var4, double var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4ub(byte var0, byte var1, byte var2, byte var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4us(short var0, short var1, short var2, short var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4ui(int var0, int var1, int var2, int var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4bv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4bv(ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4ubv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4ubv(ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4usv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4usv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColor4uiv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4uiv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        GLES10.glColorMask(red, green, blue, alpha);
    }

    @Override
    public void glColorMaterial(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglColorPointer(int var0, int var1, int var2, long var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorPointer(int size, int type, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorPointer(int size, int type, int stride, IntBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCopyPixels(int var0, int var1, int var2, int var3, int var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCullFace(int mode) {
        GLES10.glCullFace(mode);
    }

    @Override
    public void glDeleteLists(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDepthFunc(int func) {
        GLES10.glDepthFunc(func);
    }

    @Override
    public void glDepthMask(boolean flag) {
        GLES10.glDepthMask(flag);
    }

    @Override
    public void glDepthRange(double zNear, double zFar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDisableClientState(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawArrays(int mode, int first, int count) {
        GLES10.glDrawArrays(mode, first, count);
    }

    @Override
    public void glDrawBuffer(int buf) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglDrawElements(int mode, int count, int type, long indices) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawElements(int mode, int count, int type, long indices) {
        GLES11.glDrawElements(mode, count, type, (int) indices);
    }

    @Override
    public void glDrawElements(int mode, int type, ByteBuffer indices) {
        GLES10.glDrawElements(mode, indices.limit(), type, indices);
    }

    @Override
    public void glDrawElements(int mode, ByteBuffer indices) {
        GLES10.glDrawElements(mode, indices.limit(), GLES10.GL_BYTE, indices);
    }

    @Override
    public void glDrawElements(int mode, ShortBuffer indices) {
        GLES10.glDrawElements(mode, indices.limit(), GLES10.GL_SHORT, indices);
    }

    @Override
    public void glDrawElements(int mode, IntBuffer indices) {
        GLES10.glDrawElements(mode, indices.limit(), GLES20.GL_INT, indices);
    }

    @Override
    public void nglDrawPixels(int var0, int var1, int var2, int var3, long var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEdgeFlag(boolean var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglEdgeFlagv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEdgeFlagv(ByteBuffer flag) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglEdgeFlagPointer(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEdgeFlagPointer(int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEdgeFlagPointer(int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEnableClientState(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEnd() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord1f(float var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglEvalCoord1fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord1fv(FloatBuffer u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord1d(double var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglEvalCoord1dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord1dv(DoubleBuffer u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord2f(float var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglEvalCoord2fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord2fv(FloatBuffer u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord2d(double var0, double var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglEvalCoord2dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord2dv(DoubleBuffer u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalMesh1(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalMesh2(int var0, int var1, int var2, int var3, int var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalPoint1(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalPoint2(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglFeedbackBuffer(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFeedbackBuffer(int type, FloatBuffer buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFinish() {
        GLES10.glFinish();
    }

    @Override
    public void glFlush() {
        GLES10.glFlush();
    }

    @Override
    public void glFogi(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglFogiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFogiv(int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFogf(int var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglFogfv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFogfv(int pname, FloatBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFrontFace(int dir) {
        GLES10.glFrontFace(dir);
    }

    @Override
    public int glGenLists(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGenTextures(int n, long textures) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenTextures(IntBuffer textures) {
        GLES10.glGenTextures(textures.limit(), textures);
    }

    @Override
    public int glGenTextures() {
        GLES10.glGenTextures(1, tmp_int, 0);
        return tmp_int[0];
    }

    @Override
    public void nglDeleteTextures(int n, long textures) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDeleteTextures(IntBuffer textures) {
        GLES10.glDeleteTextures(textures.limit(), textures);
    }

    @Override
    public void glDeleteTextures(int texture) {
        tmp_int[0] = texture;
        GLES10.glDeleteTextures(1, tmp_int, 0);
    }

    @Override
    public void nglGetClipPlane(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetClipPlane(int plane, DoubleBuffer equation) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetBooleanv(int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetBooleanv(int pname, ByteBuffer params) {
        GLES11.glGetBooleanv(pname, params.asIntBuffer());
    }

    @Override
    public boolean glGetBoolean(int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetFloatv(int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetFloatv(int pname, FloatBuffer params) {
        GLES11.glGetFloatv(pname, params);
    }

    @Override
    public float glGetFloat(int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetIntegerv(int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetIntegerv(int pname, IntBuffer params) {
        GLES10.glGetIntegerv(pname, params);
    }

    @Override
    public int glGetInteger(int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetDoublev(int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetDoublev(int pname, DoubleBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double glGetDouble(int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetError() {
        return GLES10.glGetError();
    }

    @Override
    public void nglGetLightiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetLightiv(int light, int pname, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetLighti(int light, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetLightfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetLightfv(int light, int pname, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public float glGetLightf(int light, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetMapiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMapiv(int target, int query, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetMapi(int target, int query) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetMapfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMapfv(int target, int query, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public float glGetMapf(int target, int query) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetMapdv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMapdv(int target, int query, DoubleBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double glGetMapd(int target, int query) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetMaterialiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMaterialiv(int face, int pname, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetMaterialfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMaterialfv(int face, int pname, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetPixelMapfv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapfv(int map, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapfv(int map, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetPixelMapusv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapusv(int map, ShortBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapusv(int map, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetPixelMapuiv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapuiv(int map, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapuiv(int map, long data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetPointerv(int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long glGetPointer(int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetPolygonStipple(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPolygonStipple(ByteBuffer pattern) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPolygonStipple(long pattern) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long nglGetString(int name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String glGetString(int name) {
        return GLES10.glGetString(name);
    }

    @Override
    public void nglGetTexEnviv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexEnviv(int env, int pname, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetTexEnvi(int env, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexEnvfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexEnvfv(int env, int pname, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public float glGetTexEnvf(int env, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexGeniv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexGeniv(int coord, int pname, IntBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glGetTexGeni(int coord, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexGenfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexGenfv(int coord, int pname, FloatBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public float glGetTexGenf(int coord, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexGendv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexGendv(int coord, int pname, DoubleBuffer data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double glGetTexGend(int coord, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
        GLES31.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @Override
    public int glGetTexLevelParameteri(int target, int level, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
        GLES31.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @Override
    public float glGetTexLevelParameterf(int target, int level, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexParameteriv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
        GLES11.glGetTexParameteriv(target, pname, params);
    }

    @Override
    public int glGetTexParameteri(int target, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglGetTexParameterfv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
        GLES11.glGetTexParameterfv(target, pname, params);
    }

    @Override
    public float glGetTexParameterf(int target, int pname) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glHint(int target, int hint) {
        GLES10.glHint(target, hint);
    }

    @Override
    public void glIndexi(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexub(byte var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexs(short var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexf(float var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexd(double var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglIndexiv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexiv(IntBuffer index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglIndexubv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexubv(ByteBuffer index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglIndexsv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexsv(ShortBuffer index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglIndexfv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexfv(FloatBuffer index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglIndexdv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexdv(DoubleBuffer index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexMask(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglIndexPointer(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexPointer(int type, int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexPointer(int type, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexPointer(int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexPointer(int stride, ShortBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexPointer(int stride, IntBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInitNames() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglInterleavedArrays(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean glIsEnabled(int cap) {
        return GLES11.glIsEnabled(cap);
    }

    @Override
    public boolean glIsList(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean glIsTexture(int texture) {
        return GLES11.glIsTexture(texture);
    }

    @Override
    public void glLightModeli(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightModelf(int var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglLightModeliv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightModeliv(int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglLightModelfv(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightModelfv(int pname, FloatBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLighti(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightf(int var0, int var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglLightiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightiv(int light, int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglLightfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightfv(int light, int pname, FloatBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLineStipple(int var0, short var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLineWidth(float width) {
        GLES10.glLineWidth(width);
    }

    @Override
    public void glListBase(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglLoadMatrixf(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLoadMatrixf(FloatBuffer m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglLoadMatrixd(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLoadMatrixd(DoubleBuffer m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLoadIdentity() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLoadName(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLogicOp(int op) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMap1f(int var0, float var1, float var2, int var3, int var4, long var5) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMap1d(int var0, double var1, double var3, int var5, int var6, long var7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMap2f(int var0, float var1, float var2, int var3, int var4, float var5, float var6, int var7, int var8, long var9) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMap2d(int var0, double var1, double var3, int var5, int var6, double var7, double var9, int var11, int var12, long var13) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMapGrid1f(int var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMapGrid1d(int var0, double var1, double var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMapGrid2f(int var0, float var1, float var2, int var3, float var4, float var5) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMapGrid2d(int var0, double var1, double var3, int var5, double var6, double var8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMateriali(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMaterialf(int var0, int var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMaterialiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMaterialiv(int face, int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMaterialfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMaterialfv(int face, int pname, FloatBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMatrixMode(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMultMatrixf(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultMatrixf(FloatBuffer m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglMultMatrixd(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultMatrixd(DoubleBuffer m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFrustum(double var0, double var2, double var4, double var6, double var8, double var10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNewList(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEndList() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3f(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3b(byte var0, byte var1, byte var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3s(short var0, short var1, short var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3i(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3d(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglNormal3fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglNormal3bv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3bv(ByteBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglNormal3sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglNormal3iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglNormal3dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglNormalPointer(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormalPointer(int type, int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormalPointer(int type, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormalPointer(int type, int stride, ShortBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormalPointer(int type, int stride, IntBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormalPointer(int type, int stride, FloatBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glOrtho(double var0, double var2, double var4, double var6, double var8, double var10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPassThrough(float var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglPixelMapfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapfv(int map, int size, long values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapfv(int map, FloatBuffer values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglPixelMapusv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapusv(int map, int size, long values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapusv(int map, ShortBuffer values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglPixelMapuiv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapuiv(int map, int size, long values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapuiv(int map, IntBuffer values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelStorei(int pname, int param) {
        GLES10.glPixelStorei(pname, param);
    }

    @Override
    public void glPixelStoref(int pname, float param) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelTransferi(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelTransferf(int var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelZoom(float var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPointSize(float size) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPolygonMode(int face, int mode) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPolygonOffset(float factor, float units) {
        GLES10.glPolygonOffset(factor, units);
    }

    @Override
    public void nglPolygonStipple(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPolygonStipple(ByteBuffer pattern) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPolygonStipple(long pattern) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPushAttrib(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPushClientAttrib(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPopAttrib() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPopClientAttrib() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPopMatrix() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPopName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglPrioritizeTextures(int var0, long var1, long var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPushMatrix() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPushName(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2i(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2s(short var0, short var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2f(float var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2d(double var0, double var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos2iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2iv(IntBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos2sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2sv(ShortBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos2fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2fv(FloatBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos2dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2dv(DoubleBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3i(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3s(short var0, short var1, short var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3f(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3d(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos3iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3iv(IntBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos3sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3sv(ShortBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos3fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3fv(FloatBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos3dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3dv(DoubleBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4i(int var0, int var1, int var2, int var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4s(short var0, short var1, short var2, short var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4f(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4d(double var0, double var2, double var4, double var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos4iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4iv(IntBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos4sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4sv(ShortBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos4fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4fv(FloatBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRasterPos4dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4dv(DoubleBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glReadBuffer(int src) {
        GLES30.glReadBuffer(src);
    }

    @Override
    public void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        GLES10.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        GLES30.glReadPixels(x, y, width, height, format, type, (int) pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
        GLES10.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
        GLES10.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
        GLES10.glReadPixels(x, y, width, height, format, type, pixels);
    }

    @Override
    public void glRecti(int var0, int var1, int var2, int var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRects(short var0, short var1, short var2, short var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectf(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectd(double var0, double var2, double var4, double var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRectiv(long var0, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectiv(IntBuffer v1, IntBuffer v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRectsv(long var0, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectsv(ShortBuffer v1, ShortBuffer v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRectfv(long var0, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectfv(FloatBuffer v1, FloatBuffer v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglRectdv(long var0, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectdv(DoubleBuffer v1, DoubleBuffer v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int glRenderMode(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRotatef(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRotated(double var0, double var2, double var4, double var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glScalef(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glScaled(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glScissor(int x, int y, int width, int height) {
        GLES10.glScissor(x, y, width, height);
    }

    @Override
    public void nglSelectBuffer(int var0, long var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSelectBuffer(IntBuffer buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glShadeModel(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glStencilFunc(int func, int ref, int mask) {
        GLES10.glStencilFunc(func, ref, mask);
    }

    @Override
    public void glStencilMask(int mask) {
        GLES10.glStencilMask(mask);
    }

    @Override
    public void glStencilOp(int sfail, int dpfail, int dppass) {
        GLES10.glStencilOp(sfail, dpfail, dppass);
    }

    @Override
    public void glTexCoord1f(float var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1s(short var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1i(int var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1d(double var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord1fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord1sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord1iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord1dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2f(float var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2s(short var0, short var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2i(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2d(double var0, double var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord2fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord2sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord2iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord2dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3f(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3s(short var0, short var1, short var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3i(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3d(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord3fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord3sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord3iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord3dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4f(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4s(short var0, short var1, short var2, short var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4i(int var0, int var1, int var2, int var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4d(double var0, double var2, double var4, double var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord4fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4fv(FloatBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord4sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4sv(ShortBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord4iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4iv(IntBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoord4dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4dv(DoubleBuffer v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexCoordPointer(int var0, int var1, int var2, long var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordPointer(int size, int type, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexEnvi(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexEnviv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexEnviv(int target, int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexEnvf(int var0, int var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexEnvfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexEnvfv(int target, int pname, FloatBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGeni(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexGeniv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGeniv(int coord, int pname, IntBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGenf(int var0, int var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexGenfv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGenfv(int coord, int pname, FloatBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGend(int var0, int var1, double var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexGendv(int var0, int var1, long var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGendv(int coord, int pname, DoubleBuffer params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        throw new UnsupportedOperationException(); // args
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    @Override
    public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
        GLES10.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    @Override
    public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        GLES10.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Override
    public void glTexParameteri(int target, int pname, int param) {
        GLES11.glTexParameteri(target, pname, param);
    }

    @Override
    public void nglTexParameteriv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexParameteriv(int target, int pname, IntBuffer params) {
        GLES11.glTexParameteriv(target, pname, params);
    }

    @Override
    public void glTexParameterf(int target, int pname, float param) {
        GLES10.glTexParameterf(target, pname, param);
    }

    @Override
    public void nglTexParameterfv(int target, int pname, long params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexParameterfv(int target, int pname, FloatBuffer params) {
        GLES20.glTexParameterfv(target, pname, params);
    }

    @Override
    public void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        throw new UnsupportedOperationException(); // args
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    @Override
    public void glTranslatef(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTranslated(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2f(float var0, float var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2s(short var0, short var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2i(int var0, int var1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2d(double var0, double var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex2fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2fv(FloatBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex2sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2sv(ShortBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex2iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2iv(IntBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex2dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2dv(DoubleBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3f(float var0, float var1, float var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3s(short var0, short var1, short var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3i(int var0, int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3d(double var0, double var2, double var4) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex3fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3fv(FloatBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex3sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3sv(ShortBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex3iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3iv(IntBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex3dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3dv(DoubleBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4f(float var0, float var1, float var2, float var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4s(short var0, short var1, short var2, short var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4i(int var0, int var1, int var2, int var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4d(double var0, double var2, double var4, double var6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex4fv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4fv(FloatBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex4sv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4sv(ShortBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex4iv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4iv(IntBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertex4dv(long var0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4dv(DoubleBuffer coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nglVertexPointer(int var0, int var1, int var2, long var3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexPointer(int size, int type, int stride, ByteBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexPointer(int size, int type, int stride, long pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexPointer(int size, int type, int stride, ShortBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexPointer(int size, int type, int stride, IntBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertexPointer(int size, int type, int stride, FloatBuffer pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glViewport(int x, int y, int w, int h) {
        GLES10.glViewport(x, y, w, h);
    }

    @Override
    public boolean glAreTexturesResident(int[] textures, ByteBuffer residences) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glClipPlane(int plane, double[] equation) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3usv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor3uiv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4usv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glColor4uiv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, short[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, int[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glDrawPixels(int width, int height, int format, int type, float[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord1fv(float[] u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord1dv(double[] u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord2fv(float[] u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glEvalCoord2dv(double[] u) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFeedbackBuffer(int type, float[] buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFogiv(int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glFogfv(int pname, float[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGenTextures(int[] textures) {
        GLES10.glGenTextures(textures.length, textures, 0);
    }

    @Override
    public void glDeleteTextures(int[] textures) {
        GLES10.glDeleteTextures(textures.length, textures, 0);
    }

    @Override
    public void glGetClipPlane(int plane, double[] equation) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetFloatv(int pname, float[] params) {
        GLES11.glGetFloatv(pname, params, 0);
    }

    @Override
    public void glGetIntegerv(int pname, int[] params) {
        GLES10.glGetIntegerv(pname, params, 0);
    }

    @Override
    public void glGetDoublev(int pname, double[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetLightiv(int light, int pname, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetLightfv(int light, int pname, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMapiv(int target, int query, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMapfv(int target, int query, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMapdv(int target, int query, double[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMaterialiv(int face, int pname, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetMaterialfv(int face, int pname, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapfv(int map, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapusv(int map, short[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetPixelMapuiv(int map, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexEnviv(int env, int pname, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexEnvfv(int env, int pname, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexGeniv(int coord, int pname, int[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexGenfv(int coord, int pname, float[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexGendv(int coord, int pname, double[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, short[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, int[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, float[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexImage(int tex, int level, int format, int type, double[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glGetTexLevelParameteriv(int target, int level, int pname, int[] params) {
        GLES32.glGetTexLevelParameteriv(target, level, pname, params, 0);
    }

    @Override
    public void glGetTexLevelParameterfv(int target, int level, int pname, float[] params) {
        GLES32.glGetTexLevelParameterfv(target, level, pname, params, 0);
    }

    @Override
    public void glGetTexParameteriv(int target, int pname, int[] params) {
        GLES11.glGetTexParameteriv(target, pname, params, 0);
    }

    @Override
    public void glGetTexParameterfv(int target, int pname, float[] params) {
        GLES11.glGetTexParameterfv(target, pname, params, 0);
    }

    @Override
    public void glIndexiv(int[] index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexsv(short[] index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexfv(float[] index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glIndexdv(double[] index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, short[] pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, int[] pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, float[] pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glInterleavedArrays(int format, int stride, double[] pointer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightModeliv(int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightModelfv(int pname, float[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightiv(int light, int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLightfv(int light, int pname, float[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLoadMatrixf(float[] m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glLoadMatrixd(double[] m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap1f(int target, float u1, float u2, int stride, int order, float[] points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap1d(int target, double u1, double u2, int stride, int order, double[] points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMaterialiv(int face, int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMaterialfv(int face, int pname, float[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultMatrixf(float[] m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glMultMatrixd(double[] m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glNormal3dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapfv(int map, float[] values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapusv(int map, short[] values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPixelMapuiv(int map, int[] values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glPrioritizeTextures(int[] textures, float[] priorities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2iv(int[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2sv(short[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2fv(float[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos2dv(double[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3iv(int[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3sv(short[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3fv(float[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos3dv(double[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4iv(int[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4sv(short[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4fv(float[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRasterPos4dv(double[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
        final ShortBuffer pixelsBuffer = createShortBuffer(pixels.length);
        GLES10.glReadPixels(x, y, width, height, format, type, pixelsBuffer);
        pixelsBuffer.get(pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
        final IntBuffer pixelsBuffer = createIntBuffer(pixels.length);
        GLES10.glReadPixels(x, y, width, height, format, type, pixelsBuffer);
        pixelsBuffer.get(pixels);
    }

    @Override
    public void glReadPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
        final FloatBuffer pixelsBuffer = createFloatBuffer(pixels.length);
        GLES10.glReadPixels(x, y, width, height, format, type, pixelsBuffer);
        pixelsBuffer.get(pixels);
    }

    @Override
    public void glRectiv(int[] v1, int[] v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectsv(short[] v1, short[] v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectfv(float[] v1, float[] v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glRectdv(double[] v1, double[] v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glSelectBuffer(int[] buffer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord1dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord2dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord3dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4fv(float[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4sv(short[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4iv(int[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexCoord4dv(double[] v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexEnviv(int target, int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexEnvfv(int target, int pname, float[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGeniv(int coord, int pname, int[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGenfv(int coord, int pname, float[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexGendv(int coord, int pname, double[] params) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, short[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, int[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, float[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, double[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, short[] pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, int[] pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, float[] pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, double[] pixels) {
        GLES10.glTexImage2D(target, level, internalformat, width, height, border, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexParameteriv(int target, int pname, int[] params) {
        GLES11.glTexParameteriv(target, pname, params, 0);
    }

    @Override
    public void glTexParameterfv(int target, int pname, float[] params) {
        GLES11.glTexParameterfv(target, pname, params, 0);
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, short[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, int[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, float[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, double[] pixels) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, createBuffer(pixels));
    }

    @Override
    public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
        GLES10.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, createBuffer(pixels));
    }

    @Override
    public void glVertex2fv(float[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2sv(short[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2iv(int[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex2dv(double[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3fv(float[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3sv(short[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3iv(int[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex3dv(double[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4fv(float[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4sv(short[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4iv(int[] coords) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void glVertex4dv(double[] coords) {
        throw new UnsupportedOperationException();
    }

}