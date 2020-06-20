package PaquetePrincipal;

import java.io.*;

    public class MyObjectOutputStream extends ObjectOutputStream {

        private boolean append;
        private boolean initialized;
        private DataOutputStream dout;

        protected MyObjectOutputStream(boolean append) throws IOException, SecurityException
        {
            super();
            this.append = append;
            this.initialized = true;
        }

        public MyObjectOutputStream (OutputStream out, boolean append) throws IOException
        {
            super(out);
            this.append = append;
            this.initialized = true;
            this.dout = new DataOutputStream(out);
            this.writeStreamHeader();
        }

        @Override
        protected void writeStreamHeader() throws IOException
        {
            if (!this.initialized || this.append) return;
            if (dout != null) {
                dout.writeShort(STREAM_MAGIC);
                dout.writeShort(STREAM_VERSION);
            }
        }
}
