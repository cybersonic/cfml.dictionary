
package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class cfpop extends GenericStartTagTypeCf {
	protected static final cfpop INSTANCE = new cfpop();

	private cfpop() {
		super("CFML if tag", "<cfpop", ">", EndTagType.NORMAL, true, true, false);
	}

}
					