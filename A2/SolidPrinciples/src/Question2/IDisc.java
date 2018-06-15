/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.time.Duration;
import java.util.ArrayList;

/**
 *
 * @author Vikas
 */
public interface IDisc extends ILibraryItem{
    public ArrayList<String> GetCastList();
    public Duration GetPlayTime();
}
