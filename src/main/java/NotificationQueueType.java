/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum NotificationQueueType implements org.apache.thrift.TEnum {
  GLOBAL(1),
  MESSAGE(2),
  PRIMARY(3);

  private final int value;

  private NotificationQueueType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static NotificationQueueType findByValue(int value) { 
    switch (value) {
      case 1:
        return GLOBAL;
      case 2:
        return MESSAGE;
      case 3:
        return PRIMARY;
      default:
        return null;
    }
  }
}
