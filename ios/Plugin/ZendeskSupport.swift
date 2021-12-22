import Foundation

@objc public class ZendeskSupport: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
