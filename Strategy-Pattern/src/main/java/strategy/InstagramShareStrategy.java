package strategy;

import enums.ShareAction;

public class InstagramShareStrategy implements ShareStrategy {
    @Override
    public void share(String content) {
        // Invoke Instagram API
        System.out.println("Posted " + content + " on Instagram");
    }

    @Override
    public boolean isApplicable(ShareAction shareAction) {
        return shareAction.equals(ShareAction.INSTAGRAM);
    }
}
