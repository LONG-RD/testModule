package com.longBldg;

import javax.baja.nre.annotations.*;
import javax.baja.status.*;
import javax.baja.sys.*;
import javax.baja.naming.*;

@NiagaraType
@NiagaraProperty(
        name = "pxFile",
        type = "BOrd",
        defaultValue = "BOrd.make(\"file:^px/Buttons/Buttons.px\")"
)
@NiagaraAction(
        name = "makeButton"
)

/**
 * Created by Tech VM on 7/29/2016.
 */
public class BButtonMan extends BComponent{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.longBldg.BButtonMan(3567221616)1.0$ @*/
/* Generated Mon Aug 01 09:41:08 MDT 2016 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "pxFile"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code pxFile} property.
   * @see #getPxFile
   * @see #setPxFile
   */
  public static final Property pxFile = newProperty(0, BOrd.make("file:^px/Buttons/Buttons.px"), null);
  
  /**
   * Get the {@code pxFile} property.
   * @see #pxFile
   */
  public BOrd getPxFile() { return (BOrd)get(pxFile); }
  
  /**
   * Set the {@code pxFile} property.
   * @see #pxFile
   */
  public void setPxFile(BOrd v) { set(pxFile, v, null); }

////////////////////////////////////////////////////////////////
// Action "makeButton"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code makeButton} action.
   * @see #makeButton()
   */
  public static final Action makeButton = newAction(0, null);
  
  /**
   * Invoke the {@code makeButton} action.
   * @see #makeButton
   */
  public void makeButton() { invoke(makeButton, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BButtonMan.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void doMakeButton(Context cx){

    }

}
