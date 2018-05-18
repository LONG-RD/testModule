package com.longBldg;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.*;
import javax.baja.sys.*;


//New N4 Slot-O-Matic Format:
@NiagaraType
@NiagaraProperty(
        name = "out",
        type = "BStatusBoolean",
        defaultValue = "new BStatusBoolean(false)",
        flags = Flags.OPERATOR | Flags.SUMMARY | Flags.READONLY
)
@NiagaraProperty(
        name = "input",
        type = "BStatusBoolean",
        defaultValue = "new BStatusBoolean(false)",
        flags = Flags.OPERATOR | Flags.SUMMARY
)
@NiagaraProperty(
        name = "unlatch",
        type = "BStatusBoolean",
        defaultValue = "new BStatusBoolean(false)",
        flags = Flags.OPERATOR | Flags.SUMMARY
)

/**
 * Created by Tech VM on 7/28/2016.
 */
public class BBooleanLatch extends BComponent {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.longBldg.BBooleanLatch(833311528)1.0$ @*/
/* Generated Thu Jul 28 12:52:16 MDT 2016 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "out"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code out} property.
   * @see #getOut
   * @see #setOut
   */
  public static final Property out = newProperty(Flags.OPERATOR | Flags.SUMMARY | Flags.READONLY, new BStatusBoolean(false), null);
  
  /**
   * Get the {@code out} property.
   * @see #out
   */
  public BStatusBoolean getOut() { return (BStatusBoolean)get(out); }
  
  /**
   * Set the {@code out} property.
   * @see #out
   */
  public void setOut(BStatusBoolean v) { set(out, v, null); }

////////////////////////////////////////////////////////////////
// Property "input"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code input} property.
   * @see #getInput
   * @see #setInput
   */
  public static final Property input = newProperty(Flags.OPERATOR | Flags.SUMMARY, new BStatusBoolean(false), null);
  
  /**
   * Get the {@code input} property.
   * @see #input
   */
  public BStatusBoolean getInput() { return (BStatusBoolean)get(input); }
  
  /**
   * Set the {@code input} property.
   * @see #input
   */
  public void setInput(BStatusBoolean v) { set(input, v, null); }

////////////////////////////////////////////////////////////////
// Property "unlatch"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code unlatch} property.
   * @see #getUnlatch
   * @see #setUnlatch
   */
  public static final Property unlatch = newProperty(Flags.OPERATOR | Flags.SUMMARY, new BStatusBoolean(false), null);
  
  /**
   * Get the {@code unlatch} property.
   * @see #unlatch
   */
  public BStatusBoolean getUnlatch() { return (BStatusBoolean)get(unlatch); }
  
  /**
   * Set the {@code unlatch} property.
   * @see #unlatch
   */
  public void setUnlatch(BStatusBoolean v) { set(unlatch, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BBooleanLatch.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void changed(Property property, Context cx)
    {
        super.changed(property, cx);
        if(getInput().getValue()){
            getOut().setValue(true);
        }

        if(getUnlatch().getValue()){
            getOut().setValue(getInput().getValue());
        }
    }

    public BIcon getIcon(){
        return icon;
    }

    private static final BIcon icon = BIcon.make("module://icons/x16/control/booleanPoint.png");


}
