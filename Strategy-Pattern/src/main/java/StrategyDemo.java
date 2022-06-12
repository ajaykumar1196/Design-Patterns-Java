import enums.ShareAction;
import strategy.FacebookShareStrategy;
import strategy.InstagramShareStrategy;
import strategy.ShareStrategy;
import strategy.TwitterShareStrategy;

import java.util.Arrays;
import java.util.List;

public class StrategyDemo {
    public static List<ShareStrategy> shareStrategyList = Arrays.asList(
            new InstagramShareStrategy(),
            new FacebookShareStrategy(),
            new TwitterShareStrategy());

    public static void main(String[] args) {
        String content = "Funny video 2022";
        shareContent(content, ShareAction.FACEBOOK);
        shareContent(content, ShareAction.INSTAGRAM);
        shareContent(content, ShareAction.TWITTER);
    }

    public static void shareContent(String content, ShareAction shareAction) {
        for (ShareStrategy strategy : shareStrategyList) {
            if(strategy.isApplicable(shareAction)) {
                strategy.share(content);
            }
        }
    }
}
