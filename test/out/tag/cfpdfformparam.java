
package cfml.parsing.cfmentat.tag;

import net.htmlparser.jericho.EndTagType;
import net.htmlparser.jericho.ParseText;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.StartTag;
import net.htmlparser.jericho.StartTagTypeGenericImplementation;
import net.htmlparser.jericho.Tag;

final class cfpdfformparam extends GenericStartTagTypeCf {
	protected static final cfpdfformparam INSTANCE = new cfpdfformparam();

	private cfpdfformparam() {
		super("CFML if tag", "<cfpdfformparam", ">", EndTagType.NORMAL, true, true, false);
	}

}
					