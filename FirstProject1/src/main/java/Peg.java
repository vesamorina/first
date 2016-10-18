import com.sun.xml.internal.fastinfoset.sax.Properties;
import jdk.internal.org.objectweb.asm.tree.AbstractInsnNode;
import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.w3c.dom.ProcessingInstruction;

import java.io.IOException;

/**
 * Created by Vesa on 10/18/2016.
 */
public final class Peg{

    public static short getProcessingInstruction() {

        return ProcessingInstruction.DOCUMENT_TYPE_NODE;

    }
}
