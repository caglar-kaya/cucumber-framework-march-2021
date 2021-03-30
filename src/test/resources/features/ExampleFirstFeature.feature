Feature: First Feature
  Scenario Outline: We are checking cucumber keywords
    Given This is Given <number>
    When This is "<string>"
    Then This is Then

    Examples:
      | number | string |
      | 5      | caglar |

