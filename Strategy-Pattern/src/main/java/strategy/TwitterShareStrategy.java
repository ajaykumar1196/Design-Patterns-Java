package strategy;

import enums.ShareAction;

public class TwitterShareStrategy implements ShareStrategy {

    @Override
    public void share(String content) {
        // Invoke Twitter API
        System.out.println("Tweeted " + content + " on Twitter");
    }

    @Override
    public boolean isApplicable(ShareAction shareAction) {
        return shareAction.equals(ShareAction.TWITTER);
    }
}
