import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Iterator;
/**
 * The PlayerView knows how to represent a Player. This is purely a visual view.
 * It does not allow interaction, thus their is no controller.
 * @author  Tony Sintes STYOOP
 */
public class PlayerView extends JPanel implements PlayerListener {

    private JPanel cards = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
    private TitledBorder border;
    
    public PlayerView( Player player ) {
        super( new BorderLayout() );
        buildUI( player );
        player.addListener( this );
    }
    
    public void playerChanged( Player p ) {   
        border.setTitle( p.getName() );
        cards.removeAll();
        Hand hand = p.getHand();
        Iterator i = hand.getCards();
        while( i.hasNext() ) {
            VCard vcard = (VCard) i.next();
            JLabel card = new CardView( vcard );
            cards.add( card );
        }
        revalidate();  
        repaint();
    }
    
    public void playerBusted( Player player ) {
        border.setTitle( player.getName() + " BUSTED!" );
        cards.repaint();
    }
    
    public void playerBlackjack( Player player ) {
        border.setTitle( player.getName() + " BLACKJACK!" );
        cards.repaint();
    }
    
    public void playerStanding( Player player ) {
        border.setTitle( player.getName() + " STANDING" );
        cards.repaint();
    }
    
    public void playerWon( Player player ) {
        border.setTitle( player.getName() + " WINNER!" );
        cards.repaint();
    }
    
    public void playerLost( Player player ) {
        border.setTitle( player.getName() + " LOSER!" );
        cards.repaint();
    }
    
    public void playerStandoff( Player player ) {
        border.setTitle( player.getName() + " STANDOFF!" );
        cards.repaint();
    }
     
    private void buildUI( Player player ) {
        add( cards, BorderLayout.NORTH );
        border = new TitledBorder( player.getName() );
        cards.setBorder( border );
        cards.setBackground( new Color( 35, 142, 35 ) );
        border.setTitleColor( Color.black );
    }
   
}