package strategy;

import enums.ShareAction;

public class FacebookShareStrategy implements ShareStrategy {
    @Override
    public void share(String content) {
        // Invoke Facebook API
        System.out.println("Shared " + content + " on Facebook");
    }

    @Override
    public boolean isApplicable(ShareAction shareAction) {
        return shareAction.equals(ShareAction.FACEBOOK);
    }
}
