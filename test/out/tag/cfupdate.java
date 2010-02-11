
package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class cfupdate extends GenericStartTagTypeCf {
	protected static final cfupdate INSTANCE = new cfupdate();

	private cfupdate() {
		super("CFML if tag", "<cfupdate", ">", EndTagType.NORMAL, true, true, false);
	}

}
					