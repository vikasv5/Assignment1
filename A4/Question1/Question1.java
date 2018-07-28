import java.lang.StringBuilder;

public class Question1 {
    public String BuildBookQuoteHTML() {
        StringBuilder builder = new StringBuilder();
        // Build header.
        String headers[] = {"<H1>A page of famous book quotes!</H1>\n", "<H2>- Some book reviewer</H2>"};
        addFullHtmlTagToBuilder(builder, headers);
        // Add book quotes.
        String[] paragraphs = {"I know. I was there. I saw the great void in your soul, and you saw mine.",
                "She says nothing at all, but simply stares upward into the dark sky and watches, with sad eyes, the slow dance of the infinite stars.",
                "Clocks slay time… time is dead as long as it is being clicked off by little wheels; only when the clock stops does time come to life.",
                "None of those other things makes a difference. Love is the strongest thing in the world, you know. Nothing can touch it. Nothing comes close. If we love each other we’re safe from it all. Love is the biggest thing there is.",
                "Sometimes we get sad about things and we don’t like to tell other people that we are sad about them. We like to keep it a secret. Or sometimes, we are sad but we really don’t know why we are sad, so we say we aren’t sad but we really are.",
                "I know not all that may be coming, but be it what it will, I’ll go to it laughing.",
                "Maybe ever’body in the whole damn world is scared of each other.",
                "Life is to be lived, not controlled; and humanity is won by continuing to play in face of certain defeat.",
                "It's the possibility of having a dream come true that makes life interesting.",
                "I cannot fix on the hour, or the spot, or the look or the words, which laid the foundation. It is too long ago. I was in the middle before I knew that I had begun.",
                "There is no greater agony than bearing an untold story inside you.",
                "Still, there are times I am bewildered by each mile I have traveled, each meal I have eaten, each person I have known, each room in which I have slept. As ordinary as it all appears, there are times when it is beyond my imagination.",
                "And so we beat on, boats against the current, borne back ceaselessly into the past.",
                "Hello, babies. Welcome to Earth. It's hot in the summer and cold in the winter. It's round and wet and crowded. At the outside, babies, you've got about a hundred years here. There's only one rule that I know of, babies—God damn it, you've got to be kind.",
                "He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.",
                "How wonderful it is that nobody need wait a single moment before starting to improve the world."

        };
        addParagraphToBuilder(builder, paragraphs);
        headers = new String[]{"<A HREF=\"page2.html\">Click here to go to the next page!</A>\n"};
        addFullHtmlTagToBuilder(builder, headers);
        // Builder footer.
        return builder.toString();
    }

    public StringBuilder addParagraphToBuilder(StringBuilder builder, String para[]) {
        for (int i = 0; i < para.length; i++) {
            builder.append("<P>");
            builder.append(para[i]);
            builder.append("</P>\n");
        }
        return builder;
    }

    public StringBuilder addFullHtmlTagToBuilder(StringBuilder builder, String html[]) {
        for (int i = 0; i < html.length; i++) {
            builder.append(html[i]);
        }
        return builder;
    }

}
